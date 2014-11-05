package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.type.Chemin;

public class Etiqueter implements Instruction {
	private String etiquette;
	private Chemin chemin;

	@Override
	public void run(InterpreteurInterface i) {
		i.etiqueter(etiquette, chemin);
	}
}
