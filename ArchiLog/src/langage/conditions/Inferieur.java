package langage.conditions;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Inferieur implements Condition {

	public Inferieur() {
	}

	public boolean eval(int i, int j) {
		return i<j;
	}

}
