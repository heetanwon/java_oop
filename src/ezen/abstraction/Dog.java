package ezen.abstraction;

public abstract class Dog extends Animal {
	
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
	//eat을 구현 안한경우 똑같이 추상클래스로 만들어줘야함
	
}
