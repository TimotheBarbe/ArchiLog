package interpretation;

import java.awt.Point;

import langage.operateurs.Dessin;
import langage.type.BezierImpl;
import langage.type.Cercle;
import langage.type.Chemin;
import langage.type.CheminFerme;
import langage.type.Crayon;
import langage.type.PolygoneImpl;

public class InterpreteurImpl implements InterpreteurInterface {

	@Override
	public void remplissage(CheminFerme c, Crayon cr) {
		if (c instanceof Cercle) {
			Cercle ce = (Cercle) c;
			System.out.println("<circle cx=\"" + ce.getCentre().getX()
					+ "\" cy=\"" + ce.getCentre().getY() + "\" r=\""
					+ ce.getRayon() + "\" fill=\"" + cr.getColor() + "\" />");
		}
		if (c instanceof PolygoneImpl) {
			PolygoneImpl p = (PolygoneImpl) c;
			String liste = "";
			for (Point pt : p.getPoints()) {
				liste += pt.getX() + "," + pt.getY() + " ";
			}
			System.out.println("<polygon points=\"" + liste
					+ "\" style=\"fill:" + cr.getColor() + ";\" />");
		}

	}

	@Override
	public void dessiner(Chemin c, Crayon cr) {
		if (c instanceof Cercle) {
			Cercle ce = (Cercle) c;
			System.out.println("<circle cx=\"" + ce.getCentre().getX()
					+ "\" cy=\"" + ce.getCentre().getY() + "\" r=\""
					+ ce.getRayon() + "\" stroke=\"" + cr.getColor()
					+ "\" stroke-width=\"" + cr.getEpaisseur()
					+ "\" fill=\"none\" />");
		}
		if (c instanceof PolygoneImpl) {
			PolygoneImpl p = (PolygoneImpl) c;
			String liste = "";
			for (Point pt : p.getPoints()) {
				liste += pt.getX() + "," + pt.getY() + " ";
			}
			System.out.println("<polygon points=\"" + liste
					+ "\" style=\"fill:none;stroke:" + cr.getColor()
					+ ";stroke-width:" + cr.getEpaisseur() + ";\" />");
		}
		if (c instanceof BezierImpl) {
			System.out.println("<bezier>");
		}
	}

	@Override
	public void inserer(Dessin aInserer) {
		aInserer.run(this);
		
	}

	@Override
	public void etiqueter(String etiquette, Chemin chemin) {
		String pos="x=\"";		
		if(chemin instanceof Cercle){
			pos+= ((Cercle) chemin).getCentre().getX();
			pos+= "\" y=\"";
			pos+= ((Cercle) chemin).getCentre().getY();
		}
		if(chemin instanceof PolygoneImpl){
			pos+= ((PolygoneImpl) chemin).getPoints()[0].getX();
			pos+= "\" y=\"";
			pos+= ((PolygoneImpl) chemin).getPoints()[0].getY();
		}
		if(chemin instanceof BezierImpl){
			pos+= ((BezierImpl) chemin).getPoints()[0].getX();
			pos+= "\" y=\"";
			pos+= ((BezierImpl) chemin).getPoints()[0].getY();
		}
		pos+="\"";
		
	}

}
