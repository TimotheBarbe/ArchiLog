package langage.conditions;

/**
 * @author Timoth� Barbe et Christophe Comoretto
 * 
 */
public class Inferieur implements Condition {

	public Inferieur() {
	}

	public boolean eval(int i, int j) {
		return i<j;
	}

}
