package ezen.car;

public class Car_example {

	public static void main(String[] args) {
		Tire tire = new Hangoktire();
		Car car = new Car(tire);
		car.run();
		car.setTire(new Kumhotire());
		car.run();
		
	}

}
