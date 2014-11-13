package langage.conditions;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public interface Condition {

	/**
	 * @param i
	 *            : 1er parametre a tester
	 * @param j
	 *            : 2eme parametre a tester
	 * @return true si la condition est realisee en i et j
	 */
	public boolean eval(int i, int j);

}
