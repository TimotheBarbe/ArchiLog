package langage.operateurs;

import interpretation.InterpreteurInterface;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public interface OperateursInterface {

	/**
	 * Effectue les taches liees a l'operation
	 * 
	 * @param i
	 *            : intepreteur de l'operation
	 */
	public void run(InterpreteurInterface i);
}
