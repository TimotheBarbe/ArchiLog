package interpretation;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import langage.operateurs.Dessin;
import langage.type.BezierImpl;
import langage.type.Cercle;
import langage.type.Chemin;
import langage.type.CheminFerme;
import langage.type.Crayon;
import langage.type.PolygoneImpl;

public class InterpreteurSVG implements InterpreteurInterface {

	private String path;

	public InterpreteurSVG(String path) {
		this.path = path;
	}

	@Override
	public void dessiner(Chemin c, Crayon cr) {
		if (c instanceof Cercle) {
			Cercle ce = (Cercle) c;
			ecrire("<circle cx=\"" + ce.getCentre().getX() + "\" cy=\""
					+ ce.getCentre().getY() + "\" r=\"" + ce.getRayon()
					+ "\" stroke=\"" + cr.getColor() + "\" stroke-width=\""
					+ cr.getEpaisseur() + "\" fill=\"none\" />");
		}
		if (c instanceof PolygoneImpl) {
			PolygoneImpl p = (PolygoneImpl) c;
			String liste = "";
			for (Point pt : p.getPoints()) {
				liste += pt.getX() + "," + pt.getY() + " ";
			}
			ecrire("<polygon points=\"" + liste
					+ "\" style=\"fill:none;stroke:" + cr.getColor()
					+ ";stroke-width:" + cr.getEpaisseur() + ";\" />");
		}
		if (c instanceof BezierImpl) {
			BezierImpl bz = (BezierImpl) c;
			String rep = "<path d=\"";
			switch (bz.getPoints().length) {
			case 2:
				rep += "M " + bz.getPoints()[0].x + " " + bz.getPoints()[0].y
						+ " L " + bz.getPoints()[1].x + " "
						+ bz.getPoints()[1].y;
				break;
			case 3:
				rep += "M " + bz.getPoints()[0].x + " " + bz.getPoints()[0].y
						+ " Q " + bz.getPoints()[1].x + " "
						+ bz.getPoints()[1].y + " " + bz.getPoints()[2].x + " "
						+ bz.getPoints()[2].y + " \" fill=\"none\"";
				break;
			}
			rep += "\" stroke=\"" + cr.getColor() + "\" stroke-width=\""
					+ cr.getEpaisseur() + "\"/>";
			ecrire(rep);
		}
	}

	@Override
	public void remplissage(CheminFerme c, Crayon cr) {
		if (c instanceof Cercle) {
			Cercle ce = (Cercle) c;
			ecrire("<circle cx=\"" + ce.getCentre().getX() + "\" cy=\""
					+ ce.getCentre().getY() + "\" r=\"" + ce.getRayon()
					+ "\" fill=\"" + cr.getColor() + "\" />");
		}
		if (c instanceof PolygoneImpl) {
			PolygoneImpl p = (PolygoneImpl) c;
			String liste = "";
			for (Point pt : p.getPoints()) {
				liste += pt.getX() + "," + pt.getY() + " ";
			}
			ecrire("<polygon points=\"" + liste + "\" style=\"fill:"
					+ cr.getColor() + ";\" />");
		}
	}

	@Override
	public void inserer(Dessin aInserer) {
		// TODO
		aInserer.run(this);
	}

	@Override
	public void etiqueter(String etiquette, Chemin chemin) {
		String pos = "x=\"";
		if (chemin instanceof Cercle) {
			pos += ((Cercle) chemin).getCentre().getX();
			pos += "\" y=\"";
			pos += ((Cercle) chemin).getCentre().getY();
		}
		if (chemin instanceof PolygoneImpl) {
			pos += ((PolygoneImpl) chemin).getPoints()[0].getX();
			pos += "\" y=\"";
			pos += ((PolygoneImpl) chemin).getPoints()[0].getY();
		}
		if (chemin instanceof BezierImpl) {
			pos += ((BezierImpl) chemin).getPoints()[0].getX();
			pos += "\" y=\"";
			pos += ((BezierImpl) chemin).getPoints()[0].getY();
		}
		pos += "\"";
		ecrire("<text" + pos + ">" + etiquette + "</text>");
	}

	private void ecrire(String s) {
		{
			try {
				// Creation du fichier s'il n'exite pas
				File file = new File(this.path);
				FileWriter fw = new FileWriter(this.path, true);
				BufferedWriter output = new BufferedWriter(fw);

				// Si le fichier est vide, ajout de la balise svg
				InputStream ips = new FileInputStream(this.path);
				InputStreamReader ipsr = new InputStreamReader(ips);
				BufferedReader br = new BufferedReader(ipsr);
				if (br.readLine() == null) {
					output.write("<svg height=\"300\" width=\"300\">\n");
				}
				br.close();

				// Ecriture de la ligne
				output.write(s + "\n");
				output.flush();
				output.close();
			} catch (IOException ioe) {
				System.out.print("Erreur : ");
				ioe.printStackTrace();
			}

		}
	}

}
