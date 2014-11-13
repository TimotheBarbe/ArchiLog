package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.type.Chemin;
import langage.type.Crayon;

/**
 * Instruction qui permet de dessiner un chemin avec un crayon choisi
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Dessiner implements Instruction {

	private Chemin ch;
	private Crayon cr;

	/**
	 * Construit et initialise une nouvelle instruction Dessiner
	 * 
	 * @param ch
	 *            : chemin a dessiner
	 * @param cr
	 *            : crayon utilisé
	 */
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
