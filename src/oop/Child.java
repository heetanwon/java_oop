package oop;

public class Child extends Parent {
	//String name;
	//int age;
	//부모 구성요소가 자식한테 그대로 상속됨
	//추가 필등 
	protected String schoolName;
	
	
	
	
	
	
	public Child() {
		//super();
		//this(null , 0 , null);
	}
	//디폴트 생성자는 전부 다 비워놓는다(다만 두개는 무조건 필요함)
	






	public Child(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		// TODO Auto-generated constructor stub
	}






	//메소드 추가
	public void song() {
		System.out.println("노래를 부릅니다");
	}
	
}
