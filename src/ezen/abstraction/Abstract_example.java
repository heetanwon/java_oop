package ezen.abstraction;

public class Abstract_example {

	public static void main(String[] args) {
		// 추상클래스는 객체를 생성할 수 없다
		//Animal animal = new Animal(x);
		
		//추상클래스는 자동형변환에서 타입으로 사용할 수 있다.
		//다형성 적용할 수 있다
		
		//Bird bird = new Bird(); 비권장
		// 타입이 바뀔 수 있기 때문에 유연하지 않음
		Animal animal = new Bird();
		animal.eat();
		animal.cry();
		//animal.fly(x);
		//추가된 메소드 호출을 위해 다운캐스팅 필요
		Bird bird = (Bird)animal;
		bird.fly();
		
		
		animal = new Cat();
		animal.eat();
		animal.cry();
		
		
		animal = new Visuung_dog();
		animal.eat();
		animal.cry();
		
		
		
	}

}
