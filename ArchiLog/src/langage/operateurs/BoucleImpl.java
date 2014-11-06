package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.conditions.Condition;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class BoucleImpl implements OperateursInterface {
		private OperateursInterface operation;
		private Condition condition;
		private int start;
		private int end;
		
	public BoucleImpl(OperateursInterface operation, Condition condition , int start, int end){
		this.operation=operation;
		this.condition=condition;
		this.start = start;
		this.end = end;
		
	}

	@Override
	public void run(InterpreteurInterface i) {
		while (condition.eval(start, end)){
			operation.run(i);
			start ++;
		}

	}

}
