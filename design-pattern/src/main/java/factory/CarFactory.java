package factory;
/**
  * �������������������幤��
 * @author yrz
 *
 */
public class CarFactory {
	
	
	public Car createCar(String carType) {
		if (carType == null) {
			return null;
		}
		if (carType.equalsIgnoreCase("Ferrari")) {
			return new Ferrari();
		} else if (carType.equalsIgnoreCase("RollsRoyce")) {
			return new RollsRoyce();
		}

		return null;
	}
}
