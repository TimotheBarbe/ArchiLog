package langage.conditions;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Different implements Condition {

	public Different() {
	}

	public boolean eval(int i, int j) {
		return i != j;
	}

}
