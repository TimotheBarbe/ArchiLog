package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.type.CheminFerme;
import langage.type.Crayon;

public class Remplir implements Instruction {

	private CheminFerme chf;
	private Crayon cr;

	public Remplir(CheminFerme chf, Crayon cr) {
		this.chf = chf;
		this.cr = cr;
	}

	@Override
	public void run(InterpreteurInterface i) {
		i.remplissage(chf, cr);
	}

}
