package langage.conditions;

public class Not implements Condition {
	private Condition condition;
	
	@Override
	public boolean eval() {
		return !condition.eval();
	}

	public Not(Condition condition) {
		super();
		this.condition = condition;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

}
