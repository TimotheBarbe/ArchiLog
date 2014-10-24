package langage.conditions;

public class different implements Condition {

	private int argument1;
	private int argument2;
	
	
	public int getArgument1() {
		return argument1;
	}


	public void setArgument1(int argument1) {
		this.argument1 = argument1;
	}


	public int getArgument2() {
		return argument2;
	}


	public void setArgument2(int argument2) {
		this.argument2 = argument2;
	}


	public different(int argument1, int argument2) {
		super();
		this.argument1 = argument1;
		this.argument2 = argument2;
	}

	public boolean eval() {
		return argument1 != argument2;
	}

}
