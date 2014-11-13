package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.conditions.Condition;

/**
 * Permet d'effectuer une des deux operations selon la condition
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class AlternativeImpl implements OperateursInterface {

	private OperateursInterface operation1;
	private OperateursInterface operation2;
	private Condition condition;
	private int j;
	private int k;

	/**
	 * Construit et initialise une nouclle Alternative
	 * 
	 * @param operation1
	 *            : effectuee si la condition en j et k est realisee
	 * @param operation2
	 *            : effectuee dans le cas contraire
	 * @param condition
	 * @param j
	 *            : debut
	 * @param k
	 *            : fin
	 */
	public AlternativeImpl(OperateursInterface operation1,
			OperateursInterface operation2, Condition condition, int j, int k) {
		super();
		this.operation1 = operation1;
		this.operation2 = operation2;
		this.condition = condition;
		this.j = j;
		this.k = k;
	}

	@Override
	public void run(InterpreteurInterface i) {
		if (condition.eval(j, k)) {
			operation1.run(i);
		} else {
			operation2.run(i);
		}

	}

}
