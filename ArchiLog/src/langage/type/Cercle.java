package langage.type;

import java.awt.Point;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Cercle implements CheminFerme {

	private Point centre;
	private double rayon;

	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [centre=" + centre + ", rayon=" + rayon + "]";
	}

}
