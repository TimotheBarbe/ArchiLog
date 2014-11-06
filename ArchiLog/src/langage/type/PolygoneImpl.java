package langage.type;

import java.awt.Point;
import java.util.Arrays;

/**
 * Un polygone représente une ensemble de points reliés entre eux
 * 
 * @author Timothé Barbe et Christophe Comoretto
 */
public class PolygoneImpl implements CheminFerme {

	private Point points[];

	/**
	 * Construit et initinalise un polygone par chacune de ses aretes
	 * 
	 * @param points
	 *            : aretes du polygone
	 */
	public PolygoneImpl(Point[] points) {
		this.points = points;
	}

	/**
	 * @return un tableau de Point representant les aretes
	 */
	public Point[] getPoints() {
		return points;
	}

	/**
	 * @param points un tableau de Point representant les nouvelles aretes
	 */
	public void setPoints(Point[] points) {
		this.points = points;
	}

	public String toString() {
		return "PolygoneImpl [points=" + Arrays.toString(points) + "]";
	}

}
