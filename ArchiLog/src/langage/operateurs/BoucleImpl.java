package langage.operateurs;

import langage.conditions.Condition;

public class BoucleImpl implements OperateursInterface {
		private OperateursInterface operation;
		private Condition condition;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (condition.eval()){
			operation.run();
		}

	}

}
