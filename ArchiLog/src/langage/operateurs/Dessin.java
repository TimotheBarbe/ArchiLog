package langage.operateurs;

import interpretation.InterpreteurInterface;

/**
 * @author Timothé Barbe et Christophe Comoretto
 * 
 */
public class Dessin implements OperateursInterface {
	private OperateursInterface s;
	
	public Dessin(OperateursInterface s){
		this.s= s;
	}
	@Override
	public void run(InterpreteurInterface i) {
		s.run(i);
	}

}
