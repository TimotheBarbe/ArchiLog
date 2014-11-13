package langage.operateurs;

import interpretation.InterpreteurInterface;

/**
 * Une séquence est une suite de deux operations
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Sequence implements OperateursInterface {

	private OperateursInterface operation1;
	private OperateursInterface operation2;

	/**
	 * Construit et initialise une nouvelle sequence
	 * 
	 * @param operation1
	 * @param operation2
	 */
	public Sequence(OperateursInterface operation1,
			OperateursInterface operation2) {
		this.operation1 = operation1;
		this.operation2 = operation2;
	}

	@Override
	public void run(InterpreteurInterface i) {
		operation1.run(i);
		operation2.run(i);
	}

}
