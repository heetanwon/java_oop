package oop;

public class Parent {
	
	
	
	private String name; 
	private int age;
	//private 자체는 상속이 안된다 
	
	
	public Parent() {
		this(null,0);
	}

	public Parent(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	//생성자는 상속되지 않는다

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
	
	
	
	
	
	
	
}
