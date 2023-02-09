package ezen.interfacee;

public class Driver_example {

	public static void main(String[] args) {
		Car car = new K3("탄","k3",false,20);
		Driver driver = new Driver(car);
		driver.drive();
		
		
		car = new Avante("누나", "아반떼", false, 20);
		driver.setCar(car);
		driver.drive();
		
		
	}

}
