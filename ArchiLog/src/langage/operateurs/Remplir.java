package langage.operateurs;

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
	public void run() {
		System.out.println("Remplissage : " + this.chf + " en "
				+ this.cr.getColor());
	}

}
