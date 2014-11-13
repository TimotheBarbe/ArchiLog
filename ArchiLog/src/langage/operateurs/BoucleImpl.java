package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.conditions.Condition;

/**
 * Operation qui permet d'effectuer plusieurs fois une operation selon une
 * condition specifiee
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class BoucleImpl implements OperateursInterface {

	private OperateursInterface operation;
	private Condition condition;
	private int start;
	private int end;

	/**
	 * Construit et initialise une nouvelle boucle
	 * 
	 * @param operation
	 *            : operation a realiser plusieurs fois
	 * @param condition
	 *            : condition d'arret de la boucle
	 * @param start
	 *            : debut de la boucle
	 * @param end
	 *            : fin de la boucle
	 */
	public BoucleImpl(OperateursInterface operation, Condition condition,
			int start, int end) {
		this.operation = operation;
		this.condition = condition;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run(InterpreteurInterface i) {
		while (condition.eval(start, end)) {
			operation.run(i);
			start++;
		}

	}

}
