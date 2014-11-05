package interpretation;

import langage.type.*;

public interface InterpreteurInterface {
	public void dessinCercle(Cercle c, Crayon cr);
	public void dessinChemin(Chemin c, Crayon cr);
	public void dessinPolygone(PolygoneImpl p, Crayon cr);
	public void remplissageCercle(Cercle c, Crayon cr);
	public void remplissagePolygone(PolygoneImpl p, Crayon cr);
	
}
