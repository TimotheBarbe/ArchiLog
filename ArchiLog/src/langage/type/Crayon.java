package langage.type;

/**
 * Un crayon se caracterise par une epaisseur de trait et une couleur
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Crayon {

	private double epaisseur;
	private Couleur color;

	/**
	 * Construit et initinalise un nouveau crayon
	 * 
	 * @param epaisseur
	 *            epaisseur du trait
	 * @param color
	 *            couleur du trait
	 */
	public Crayon(double epaisseur, Couleur color) {
		this.epaisseur = epaisseur;
		this.color = color;
	}

	/**
	 * Construit et initinalise un nouveau crayon noir d'epaisseur 1.0
	 */
	public Crayon() {
		this.epaisseur = 1;
		this.color = Couleur.black;
	}

	public String toString() {
		return "Crayon [epaisseur=" + epaisseur + ", color=" + color + "]";
	}

	/**
	 * @return epaisseur du crayon
	 */
	public double getEpaisseur() {
		return epaisseur;
	}

	/**
	 * @param epaisseur
	 *            nouvelle epaisseur du crayon
	 */
	public void setEpaisseur(double epaisseur) {
		this.epaisseur = epaisseur;
	}

	/**
	 * @return la couleur du crayon
	 */
	public Couleur getColor() {
		return color;
	}

	/**
	 * @param color
	 *            la nouvelle couleur du crayon
	 */
	public void setColor(Couleur color) {
		this.color = color;
	}

}
