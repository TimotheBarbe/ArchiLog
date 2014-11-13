package langage.operateurs;

import interpretation.InterpreteurInterface;

/**
 * Instruction qui permet d'inserer une dessin dans un autre dessin
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Inserer implements Instruction {
	private Dessin aInserer;

	/**
	 * Construit et initialise une nouvelle instruction Inserer
	 * 
	 * @param aInserer
	 *            : dessin a inserer
	 * 
	 */
	public Inserer(Dessin aInserer) {
		super();
		this.aInserer = aInserer;
	}

	@Override
	public void run(InterpreteurInterface i) {
		i.inserer(aInserer);
	}

}
