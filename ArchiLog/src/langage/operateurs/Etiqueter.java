package langage.operateurs;

import interpretation.InterpreteurInterface;
import langage.type.Chemin;

/**
 * Instruction qui permet d'ajouter une etiquette a un chemin
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Etiqueter implements Instruction {

	private String etiquette;
	private Chemin chemin;

	/**
	 * Construit et initialise une nouvelle etiquette
	 * 
	 * @param etiquette
	 *            : texte de l'etiquette
	 * @param chemin
	 *            : chemin a etiquetter
	 */
	public Etiqueter(String etiquette, Chemin chemin) {
		this.etiquette = etiquette;
		this.chemin = chemin;
	}

	@Override
	public void run(InterpreteurInterface i) {
		i.etiqueter(etiquette, chemin);
	}
}
