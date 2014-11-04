package langage.operateurs;

public class Sequence implements OperateursInterface {

	private OperateursInterface operation1;
	private OperateursInterface operation2;

	public Sequence(OperateursInterface operation1,
			OperateursInterface operation2) {
		this.operation1 = operation1;
		this.operation2 = operation2;
	}

	@Override
	public void run() {
		operation1.run();
		operation2.run();
	}

}
