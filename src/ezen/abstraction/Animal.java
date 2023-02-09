package ezen.abstraction;


/**
 * 추상클래스
 * 자식클래스들이 반드시 구현해야하는 기능을 위한 수직적 명세 역할 클래스
 * @author 김희원
 * @date  2023. 1. 6.
 */
public abstract class Animal /*extends Object*/ {
	
	protected String name;
	protected int age;
	//추상클래스는 자식 클래스와 접근이 깊으므로 같이 붙여다님
	
	
	
	public void walk() {
		System.out.println("걷습니다");
	};
	//모두 똑같은 것
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//추상메소드(수직적 규약)
	//자식 입장에서 반드시 구현해야함
	public abstract void cry();
	public abstract void eat();

	
	
}
