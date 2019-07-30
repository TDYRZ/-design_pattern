package abstractfactory;

/**
 * 生产子工厂
 * 
 * @author yrz
 *
 */
public class FactoryProducer {
	static AbstractFactory getFactory(String factoryType) {
		if (factoryType == null) {
			return null;
		}
		if (factoryType.equalsIgnoreCase("Engine")) {
			return new EngineFactory();
		} else if (factoryType.equalsIgnoreCase("Wheel")) {
			return new WheelFactory();
		} else if (factoryType.equalsIgnoreCase("Shell")) {
			return new ShellFactory();
		}

		return null;
	}
}
