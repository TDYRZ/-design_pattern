package abstractfactory;

/**
 * 引擎子工厂
 * 
 * @author yrz
 *
 */
public class EngineFactory extends AbstractFactory {

	@Override
	Engine getEngine(String engine) {
		if (engine == null) {
			return null;
		}

		if (engine.equalsIgnoreCase("FerraEngine")) {
			return new FerraEngine();
		} else if (engine.equalsIgnoreCase("RollsRoyceEngine")) {
			return new RollsRoyceEngine();
		}
		return null;
	}

	@Override
	Wheel getWheel(String wheel) {
		return null;
	}

	@Override
	Shell getShell(String shell) {
		return null;
	}

}
