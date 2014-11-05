package interpretation;

import langage.operateurs.OperateursInterface;
import langage.type.Cercle;
import langage.type.Chemin;
import langage.type.Crayon;
import langage.type.PolygoneImpl;

public interface InterpreteurInterface {
	public void dessinCercle(Cercle c, Crayon cr);

	public void dessiner(Chemin c, Crayon cr);

	public void dessinPolygone(PolygoneImpl p, Crayon cr);

	public void remplissageCercle(Cercle c, Crayon cr);

	public void remplissagePolygone(PolygoneImpl p, Crayon cr);

}
