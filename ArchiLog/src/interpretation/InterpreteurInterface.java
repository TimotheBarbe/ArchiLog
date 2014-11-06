package interpretation;

import langage.operateurs.Dessin;
import langage.type.Chemin;
import langage.type.CheminFerme;
import langage.type.Crayon;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public interface InterpreteurInterface {

	/**
	 * @param c
	 * @param cr
	 */
	public void dessiner(Chemin c, Crayon cr);

	/**
	 * @param c
	 * @param cr
	 */
	public void remplissage(CheminFerme c, Crayon cr);

	/**
	 * @param aInserer
	 */
	public void inserer(Dessin aInserer);

	/**
	 * @param etiquette
	 * @param chemin
	 */
	public void etiqueter(String etiquette, Chemin chemin);

}
