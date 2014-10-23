package langage.operateurs;

public class AlternativeImpl implements OperateursInterface {
	private OperateursInterface operation1;
	private OperateursInterface operation2;
	private Condition condition;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(condition.eval()){
			operation1.run();
		}
		else{
			operation2.run();
		}

	}

}
