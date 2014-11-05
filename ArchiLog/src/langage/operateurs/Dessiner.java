package langage.operateurs;

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
	public void run() {
		System.out.println("Dessin :" + this.ch + " en " + this.cr.getColor());
	}

}
