package abstractfactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		// 获取引擎工厂
		AbstractFactory engineFactory = FactoryProducer.getFactory("Engine");
		// 获取具体引擎
		Engine feEngine = engineFactory.getEngine("FerraEngine");

		feEngine.dosomething();

		Engine roEngine = engineFactory.getEngine("RollsRoyceEngine");

		roEngine.dosomething();


		System.out.println("--------------------------");
		
		// 获取轮子工厂
		AbstractFactory wheelFactory = FactoryProducer.getFactory("Wheel");
		// 获取具体轮子
		Wheel feWheel = wheelFactory.getWheel("FerraWheel");

		feWheel.dosomething();

		Wheel roWheel = wheelFactory.getWheel("RollsRoyceWheel");

		roWheel.dosomething();

		System.out.println("--------------------------");
		
		// 获取外壳工厂
		AbstractFactory shellFactory = FactoryProducer.getFactory("Shell");
		// 获取具体外壳
		Shell feShell = shellFactory.getShell("FerraShell");

		feShell.dosomething();

		Shell roShell = shellFactory.getShell("RollsRoyceShell");

		roShell.dosomething();
	}
}
