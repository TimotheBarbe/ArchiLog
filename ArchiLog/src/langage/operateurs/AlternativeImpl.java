package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.conditions.Condition;

public class AlternativeImpl implements OperateursInterface {
	private OperateursInterface operation1;
	private OperateursInterface operation2;
	private Condition condition;

	@Override
	public void run(InterpreteurInterface i) {
		// TODO Auto-generated method stub
		if(condition.eval()){
			operation1.run(i);
		}
		else{
			operation2.run(i);
		}

	}

}
