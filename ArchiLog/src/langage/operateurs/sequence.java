package langage.operateurs;

public class sequence implements OperateursInterface {
	private OperateursInterface operation1;
	private OperateursInterface operation2;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		operation1.run();
		operation2.run();
	}

}
