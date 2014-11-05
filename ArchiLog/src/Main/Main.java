package Main;

import interpretation.InterpreteurImpl;
import interpretation.InterpreteurInterface;

import java.awt.Point;

import langage.operateurs.Dessiner;
import langage.operateurs.Remplir;
import langage.operateurs.Sequence;
import langage.type.Cercle;
import langage.type.Couleur;
import langage.type.Crayon;
import langage.type.PolygoneImpl;

public class Main {

	public static void main(String[] args) {
		InterpreteurInterface interpreteur = new InterpreteurImpl();
		Point p1 = new Point(50, 50);
		Cercle c = new Cercle(p1, 20);

		Point p2 = new Point(50, 30);
		Point p3 = new Point(20, 30);
		Point[] points = new Point[] { p1, p2, p3 };
		PolygoneImpl pi = new PolygoneImpl(points);

		Crayon cr1 = new Crayon();
		Crayon cr2 = new Crayon(2, Couleur.blue);

		Dessiner d1 = new Dessiner(c, cr1);
		Dessiner d2 = new Dessiner(pi, cr1);

		Sequence s1 = new Sequence(d1, d2);

		Remplir r1 = new Remplir(pi, cr2);
		Sequence s2 = new Sequence(s1, r1);

		s2.run(interpreteur);

	}
}
