package interpretation;

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
			System.out.println("<cercle>");
		}
		if (c instanceof PolygoneImpl) {
			System.out.println("<poly>");
		}

	}

	@Override
	public void dessiner(Chemin c, Crayon cr) {
		if (c instanceof Cercle) {
			System.out.println("<cercle>");
		}
		if (c instanceof PolygoneImpl) {
			System.out.println("<poly>");
		}
		if (c instanceof BezierImpl) {
			System.out.println("<bezier>");
		}
	}

}
