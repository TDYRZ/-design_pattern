package abstractfactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// ��ȡ���湤��
		AbstractFactory engineFactory = FactoryProducer.getFactory("Engine");
		// ��ȡ��������
		Engine feEngine = engineFactory.getEngine("FerraEngine");

		feEngine.dosomething();

		Engine roEngine = engineFactory.getEngine("RollsRoyceEngine");

		roEngine.dosomething();


		System.out.println("--------------------------");
		
		// ��ȡ���ӹ���
		AbstractFactory wheelFactory = FactoryProducer.getFactory("Wheel");
		// ��ȡ��������
		Wheel feWheel = wheelFactory.getWheel("FerraWheel");

		feWheel.dosomething();

		Wheel roWheel = wheelFactory.getWheel("RollsRoyceWheel");

		roWheel.dosomething();

		System.out.println("--------------------------");
		
		// ��ȡ��ǹ���
		AbstractFactory shellFactory = FactoryProducer.getFactory("Shell");
		// ��ȡ�������
		Shell feShell = shellFactory.getShell("FerraShell");

		feShell.dosomething();

		Shell roShell = shellFactory.getShell("RollsRoyceShell");

		roShell.dosomething();
	}
}
