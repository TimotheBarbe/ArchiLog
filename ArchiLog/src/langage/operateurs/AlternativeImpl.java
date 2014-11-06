package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.conditions.Condition;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class AlternativeImpl implements OperateursInterface {
	
	private OperateursInterface operation1;
	private OperateursInterface operation2;
	private Condition condition;
	private int j;
	private int k;

	@Override
	public void run(InterpreteurInterface i) {
		// TODO Auto-generated method stub
		if (condition.eval(j, k)) {
			operation1.run(i);
		} else {
			operation2.run(i);
		}

	}

}
