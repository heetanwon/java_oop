package ezen.inner;
/*지역 변수 내부 클래스*/
//인스턴스변수는 내부에서 변수초기화 가능

public class Outer3 {
	String name;
	public void doTask() {
		final int x =10;
		System.out.println("doTask() 메소드 실행");
		
	
	//부모 object
	//지역 내부 클래스
	class Helper{
		public void someDo() {
			System.out.println("someDo() 메소드 실행됨");
			name = "김희원";
			System.out.println(x);
			//지역 변수는 변수초기화 불가능, 지역 상수는 접근 가능하지만 값 재할당 불가능
			}
		}
		
		Helper helper = new Helper();
		helper.someDo();
	
	
	}
	
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.doTask();
		
		
	}
	
	
}
