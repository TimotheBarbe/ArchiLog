package interpretation;

import langage.operateurs.Dessin;
import langage.type.Chemin;
import langage.type.CheminFerme;
import langage.type.Crayon;

public interface InterpreteurInterface {

	public void dessiner(Chemin c, Crayon cr);

	public void remplissage(CheminFerme c, Crayon cr);

	public void inserer(Dessin aInserer);

	public void etiqueter(String etiquette, Chemin chemin);

}
