package langage.type;

import java.awt.Point;

/**
 * Une courbe de Bezier est un chemin ouvert
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class BezierImpl implements CheminOuvert {

	private Point points[];

	/**
	 * Construit et initialise une nouvelle courbe de bezier à 2 points
	 * (segment)
	 * 
	 * @param point1
	 *            1ere extremite du segment
	 * @param point2
	 *            2eme extremite du segment
	 */
	public BezierImpl(Point point1, Point point2) {
		this.points = new Point[] { point1, point2 };
	}

	/**
	 * Construit et initialise une nouvelle courbe de bezier à 3 points
	 * 
	 * @param point1
	 *            1er point de controle
	 * @param point2
	 *            2eme point de controle
	 * @param point2
	 *            3eme point de controle
	 * 
	 */
	public BezierImpl(Point point1, Point point2, Point point3) {
		this.points = new Point[] { point1, point2, point3 };
	}

	/**
	 * @return les points de controle
	 */
	public Point[] getPoints() {
		return points;
	}

	/**
	 * @param points
	 *            les nouveaux points de controle
	 */
	public void setPoints(Point[] points) {
		this.points = points;
	}
}
