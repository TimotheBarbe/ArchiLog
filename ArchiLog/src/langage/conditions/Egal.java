package langage.conditions;

public class Egal implements Condition {


	public Egal() {
	}

	public boolean eval(int i, int j) {
		return i == j;
	}

}
