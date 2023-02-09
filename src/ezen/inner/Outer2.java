package ezen.inner;
/*정적 멤버 내부 클래스*/
public class Outer2 {
	static String name = "김기정";
	
	public void outerMethod() {
		System.out.println("외부클래스 출력입니다");
		Inner inner = new Inner();
		inner.innerMethod();
		System.out.println(inner.age);//(o)
		//System.out.println(age); //외부클래스에서는 내부클래스 변수 
		//다이렉트로 접근 불가능 
	}
	
	//정적(static) 멤버 내부 클래스
	//외부 클래스의 보조적(helper) 역할의 클래스 
	static class Inner{
		int age = 10;
		public void innerMethod() {
			System.out.println("내부클래스 출력입니다");
			System.out.println(name);
			//static 변수여야지 접근 가능(name)
			//외부클래스의 멤버를 접근할 수 있다.
			
		}
	}
	
	
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.outerMethod();
		
		//외부에서 내부클래스 사용 시 반드시 외부클래스 객체 먼저 생성한 다음
		//내부 클래스에 static 붙이기 전 
		//Outer2 outer1 = new Outer2();
		//Outer2.Inner in = outer1.new Inner();
		
		//내부 클래스에 static 붙인 후 
		Outer2.Inner inner =new Outer2.Inner();
		inner.innerMethod();
	}
	
	
}
