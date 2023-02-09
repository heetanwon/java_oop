package ezen.inner;
/*인스턴스 멤버 내부 클래스*/
public class Outer {
	String name = "김기정";
	
	public void outerMethod() {
		System.out.println("외부클래스 출력입니다");
		Inner inner = new Inner();
		inner.innerMethod();
		System.out.println(inner.age);//(o)
		//System.out.println(age); //외부클래스에서는 내부클래스 변수 
		//다이렉트로 접근 불가능 
	}
	
	//인스턴스 멤버 내부 클래스
	//외부 클래스의 보조적(helper) 역할의 클래스 
	class Inner{
		int age = 10;
		public void innerMethod() {
			System.out.println("내부클래스 출력입니다");
			System.out.println(name);
			//외부클래스의 멤버를 접근할 수 있다.
			
		}
	}
	
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMethod();
		
		//외부에서 내부클래스 사용 시 반드시 외부클래스 객체 먼저 생성한 다음
		//내부클래스를 호출해야 한다
		Outer outer1 = new Outer();
		Outer.Inner in = outer1.new Inner();
		in.innerMethod();
	}
	
	
}
