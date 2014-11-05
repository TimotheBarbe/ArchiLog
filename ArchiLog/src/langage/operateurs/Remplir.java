package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.type.CheminFerme;
import langage.type.Crayon;

public class Remplir implements Instruction {

	private CheminFerme chf;
	private Crayon cr;

	public Remplir(CheminFerme chf, Crayon cr) {
		super();
		this.chf = chf;
		this.cr = cr;
	}

	@Override
	public void run(InterpreteurInterface i) {
		System.out.println("Remplissage : " + this.chf + " en "
				+ this.cr.getColor());
	}

}
