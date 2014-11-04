package Main;

import java.awt.Point;

import langage.operateurs.*;
import langage.type.*;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point(50, 50);
		Cercle c = new Cercle(p1, 20);

		Point p2 = new Point(50, 30);
		Point p3 = new Point(20, 30);
		Point[] points = new Point[] { p1, p2, p3 };
		PolygoneImpl pi = new PolygoneImpl(points);

		Crayon cr = new Crayon();

		Dessiner d1 = new Dessiner(c, cr);
		d1.run();

		Dessiner d2 = new Dessiner(pi, cr);
		d2.run();
	}
}
