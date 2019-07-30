package factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();

		// 生产劳斯莱斯
		Car car1 = carFactory.createCar("RollsRoyce");

		car1.oil();

		// 生产法拉利

		Car car2 = carFactory.createCar("Ferrari");

		car2.oil();
	}
}
