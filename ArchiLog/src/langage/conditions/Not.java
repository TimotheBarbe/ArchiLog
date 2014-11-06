package langage.conditions;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Not implements Condition {
	private Condition condition;
	
	@Override
	public boolean eval(int i, int j) {
		return !condition.eval(i, j);
	}

	public Not(Condition condition) {
		super();
		this.condition = condition;
	}

}
