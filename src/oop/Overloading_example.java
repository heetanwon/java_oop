package oop;



//중복정의 규칙
// 메소드 이름을 똑같이 하면 정의하고자 할 때는 
// 매개변수 갯수나 데이터 타입이 반드시 달라야 한다.

class Calculator{
	

	//메소드 오버로딩(중복정의)
	//오버로딩은 데이터 타입과는 관계없고 매개변수만 관련이 있음.
	
	
	public int sum(int x, int y) {
		return x + y;
		
	}
	
	public static int sum(int x, int y, int z) {
		return x + y + z;
		
	}
	
	public double sum(double x, double y, double z) {
		return x + y + z;
		
	}
	
	
	
}

public class Overloading_example {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.sum(10, 20));
		System.out.println(calculator.sum(10.8, 20.9, 30.2));
		
		
		
	}

}
