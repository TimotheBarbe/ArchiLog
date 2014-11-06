package langage.operateurs;

import interpretation.InterpreteurInterface;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Inserer implements Instruction {
	private Dessin aInserer;

	@Override
	public void run(InterpreteurInterface i) {
		i.inserer(aInserer);

	}

}
