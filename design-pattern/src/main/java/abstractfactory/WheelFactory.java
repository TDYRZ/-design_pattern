package abstractfactory;
/**
 * 轮子子工厂
 * @author yrz
 *
 */
public class WheelFactory extends AbstractFactory{

	@Override
	Engine getEngine(String engine) {
		return null;
	}

	@Override
	Wheel getWheel(String wheel) {
		if (wheel == null) {
			return null;
		}

		if (wheel.equalsIgnoreCase("FerraWheel")) {
			return new FerraWheel();
		} else if (wheel.equalsIgnoreCase("RollsRoyceWheel")) {
			return new RollsRoyceWheel();
		}
		return null;
	}

	@Override
	Shell getShell(String shell) {
		return null;
	}

}
