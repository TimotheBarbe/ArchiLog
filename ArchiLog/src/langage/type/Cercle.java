package langage.type;

import java.awt.Point;

/**
 * Un cercle est un chemin fermé défini par son centre et son rayon
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Cercle implements CheminFerme {

	private Point centre;
	private double rayon;

	/**
	 * Construit et initialise un nouveau cercle
	 * 
	 * @param centre
	 *            point representant le centre du cercle
	 * @param rayon
	 *            rayon du cercle
	 */
	public Cercle(Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}

	/**
	 * @return centre du cercle
	 */
	public Point getCentre() {
		return centre;
	}

	/**
	 * @param centre
	 *            nouveau centre du cercle
	 */
	public void setCentre(Point centre) {
		this.centre = centre;
	}

	/**
	 * @return rayon du cercle
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon
	 *            nouveau rayon du cercle
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public String toString() {
		return "Cercle [centre=" + centre + ", rayon=" + rayon + "]";
	}

}
