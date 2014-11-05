package langage.operateurs;

import interpretation.InterpreteurInterface;

public class Sequence implements OperateursInterface {

	private OperateursInterface operation1;
	private OperateursInterface operation2;

	public Sequence(OperateursInterface operation1,
			OperateursInterface operation2) {
		this.operation1 = operation1;
		this.operation2 = operation2;
	}

	@Override
	public void run(InterpreteurInterface i) {
		operation1.run(i);
		operation2.run(i);
	}

}
