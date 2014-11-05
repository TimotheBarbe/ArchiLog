package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.conditions.Condition;

public class BoucleImpl implements OperateursInterface {
		private OperateursInterface operation;
		private Condition condition;

	@Override
	public void run(InterpreteurInterface i) {
		while (condition.eval()){
			operation.run(i);
		}

	}

}
