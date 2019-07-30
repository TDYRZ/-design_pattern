package factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();

		// ������˹��˹
		Car car1 = carFactory.createCar("RollsRoyce");

		car1.oil();

		// ����������

		Car car2 = carFactory.createCar("Ferrari");

		car2.oil();
	}
}
