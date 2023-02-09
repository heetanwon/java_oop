package ezen.abstraction;

public class Cat extends Animal {
	
	public Cat() {}
	
	public Cat(String name,int age) {
		this.name= name;
		this.age= age;
	}
	@Override
	public void cry() {
		System.out.println("야옹냥냥");
	}
	
	public void eat() {
		System.out.println("냠냠 먹습니다");
	}
	;
	
	
}
