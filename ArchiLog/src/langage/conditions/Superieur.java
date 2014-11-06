package langage.conditions;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Superieur implements Condition {

	public Superieur() {
	}

	public boolean eval(int i, int j) {
		return i > j;
	}


}
