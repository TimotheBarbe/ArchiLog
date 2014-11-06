package langage.type;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Crayon {

	private double epaisseur;
	private Couleur color;

	public Crayon(double epaisseur, Couleur color) {
		this.epaisseur = epaisseur;
		this.color = color;
	}

	public Crayon() {
		this.epaisseur = 1;
		this.color = Couleur.black;
	}

	public String toString() {
		return "Crayon [epaisseur=" + epaisseur + ", color=" + color + "]";
	}

	public double getEpaisseur() {
		return epaisseur;
	}

	public void setEpaisseur(double epaisseur) {
		this.epaisseur = epaisseur;
	}

	public Couleur getColor() {
		return color;
	}

	public void setColor(Couleur color) {
		this.color = color;
	}

}
