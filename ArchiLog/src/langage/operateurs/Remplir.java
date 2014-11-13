package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.type.CheminFerme;
import langage.type.Crayon;

/**
 * Instruction qui permet de remplir l'intérieur d'un chemin fermé rempli
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Remplir implements Instruction {

	private CheminFerme chf;
	private Crayon cr;

	/**
	 * Construit et initialise une nouvelle instruction Remplir
	 * 
	 * @param chf
	 *            : chemin ferme a remplir
	 * @param cr
	 *            : crayon utilisé pour sa couleur
	 */
	public Remplir(CheminFerme chf, Crayon cr) {
		this.chf = chf;
		this.cr = cr;
	}

	@Override
	public void run(InterpreteurInterface i) {
		i.remplissage(chf, cr);
	}

}
