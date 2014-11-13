package interpretation;

import langage.operateurs.Dessin;
import langage.type.Chemin;
import langage.type.CheminFerme;
import langage.type.Crayon;

/**
 * Interpreteur du langage
 * 
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public interface InterpreteurInterface {

	/**
	 * Dessine le chemin avec le crayon choisi
	 * 
	 * @param c
	 *            : chemin a dessiner
	 * @param cr
	 *            : crayon pour le dessin
	 */
	public void dessiner(Chemin c, Crayon cr);

	/**
	 * Remplit un chemin fermee de la couleur du crayon
	 * 
	 * @param c
	 *            : chemin a dessiner
	 * @param cr
	 *            : crayon pour le dessin
	 */
	public void remplissage(CheminFerme c, Crayon cr);

	/**
	 * Insere un dessin
	 * 
	 * @param aInserer
	 *            : dessin a inserer
	 */
	public void inserer(Dessin aInserer);

	/**
	 * Ajoute une etiquette a un chemins
	 * 
	 * @param etiquette
	 *            : texte de l'etiquette
	 * @param chemin
	 *            : chemin a etiquetter
	 */
	public void etiqueter(String etiquette, Chemin chemin);

}
