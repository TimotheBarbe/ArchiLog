package langage.conditions;

/**
 * @author Timoth� Barbe et Christophe Comoretto
 * 
 */
public class Egal implements Condition {


	public Egal() {
	}

	public boolean eval(int i, int j) {
		return i == j;
	}

}
