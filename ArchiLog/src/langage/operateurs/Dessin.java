package langage.operateurs;

import interpretation.InterpreteurInterface;

/**
 * Un dessin est un ensemble d'operation
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Dessin implements OperateursInterface {

	private OperateursInterface s;

	/**
	 * Construit et initialise un nouveau Dessin
	 * 
	 * @param s
	 *            : derniere operation du dessin
	 */
	public Dessin(OperateursInterface s) {
		this.s = s;
	}

	@Override
	public void run(InterpreteurInterface i) {
		s.run(i);
	}

}
