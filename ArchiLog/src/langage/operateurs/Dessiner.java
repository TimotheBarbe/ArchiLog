package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.type.Cercle;
import langage.type.Chemin;
import langage.type.Crayon;

public class Dessiner implements Instruction {
	private Chemin ch;
	private Crayon cr;

	public Dessiner(Chemin ch, Crayon cr) {
		this.ch = ch;
		this.cr = cr;
	}

	public Chemin getCh() {
		return ch;
	}

	public void setCh(Chemin ch) {
		this.ch = ch;
	}

	public Crayon getCr() {
		return cr;
	}

	public void setCr(Crayon cr) {
		this.cr = cr;
	}

	@Override
	public void run(InterpreteurInterface i) {
		i.dessiner(ch, cr);
	}

}
