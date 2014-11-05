package langage.operateurs;

import interpretation.InterpreteurInterface;

public class Inserer implements Instruction {
	private Dessin aInserer;

	@Override
	public void run(InterpreteurInterface i) {
		i.inserer(aInserer);

	}

}
