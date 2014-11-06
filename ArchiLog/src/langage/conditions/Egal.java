package langage.conditions;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Egal implements Condition {


	public Egal() {
	}

	public boolean eval(int i, int j) {
		return i == j;
	}

}
