package langage.conditions;

public class Different implements Condition {

	public Different() {
	}

	public boolean eval(int i, int j) {
		return i != j;
	}

}
