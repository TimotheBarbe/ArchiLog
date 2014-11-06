package Main;

import interpretation.InterpreteurConsole;
import interpretation.InterpreteurInterface;
import interpretation.InterpreteurSVG;

import java.awt.Point;

import langage.operateurs.Dessin;
import langage.operateurs.Dessiner;
import langage.operateurs.Remplir;
import langage.operateurs.Sequence;
import langage.type.BezierImpl;
import langage.type.Cercle;
import langage.type.Couleur;
import langage.type.Crayon;
import langage.type.PolygoneImpl;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(50, 50);
		Cercle c = new Cercle(p1, 20);

		Point p2 = new Point(50, 30);
		Point p3 = new Point(20, 30);
		Point p4 = new Point(12, 60);
		Point p5 = new Point(80, 72);
		Point p6 = new Point(12, 90);
		Point[] points = new Point[] { p1, p2, p3, p4 };
		PolygoneImpl pi = new PolygoneImpl(points);

		Crayon cr1 = new Crayon();
		Crayon cr2 = new Crayon(2, Couleur.blue);

		Dessiner d1 = new Dessiner(c, cr1);
		Dessiner d2 = new Dessiner(pi, cr1);

		Sequence s1 = new Sequence(d1, d2);

		Remplir r1 = new Remplir(pi, cr2);
		Sequence s2 = new Sequence(s1, r1);

		BezierImpl bz = new BezierImpl(p4, p5, p6);
		Dessiner d3 = new Dessiner(bz, cr2);
		Sequence s3 = new Sequence(s2, d3);

		Dessin dessin = new Dessin(s3);

		// INTERPRETEUR 1
		InterpreteurInterface interpreteurC = new InterpreteurConsole();
		dessin.run(interpreteurC);

		// INTERPRETEUR 2
		String path = "C:/Users/Timothé/Desktop/exemple.html";
		InterpreteurInterface interpreteurSVG = new InterpreteurSVG(path);
		dessin.run(interpreteurSVG);

	}
}
