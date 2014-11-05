package langage.operateurs;

import interpretation.InterpreteurInterface;

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
