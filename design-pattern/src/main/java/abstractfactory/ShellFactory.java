package abstractfactory;
/**
 * 外壳子工厂
 * @author yrz
 *
 */
public class ShellFactory extends AbstractFactory{

	@Override
	Engine getEngine(String engine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Wheel getWheel(String wheel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shell getShell(String shell) {
		if (shell == null) {
			return null;
		}

		if (shell.equalsIgnoreCase("FerraShell")) {
			return new FerraShell();
		} else if (shell.equalsIgnoreCase("RollsRoyceShell")) {
			return new RollsRoyceShell();
		}
		return null;
	}

}
