package setget;

public class Car2 {
	//인스턴스 필드 선언
	int speed;
	
	//인스턴스 메소드 선언 
	void run(){
		System.out.println(speed+"으로 달립니다");
	}
	
	static void simulate() {
		//객체 생성 
		Car2 car2 = new Car2();
	    car2.speed = 200;
	    car2.run();
	}

	public static void main(String[] args) {
		//정적 메소드 호출 
		simulate();
		
		Car2 car2 = new Car2();
		car2.run();
		
		
	}
	
	
	
	
	
	
}



