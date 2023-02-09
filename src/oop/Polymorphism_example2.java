package oop;




/**
 * 자바는 다형성을 지원하기 위해 클래스 자동 형변환과 메소드 재정의를 지원한다.
 * @author 김희원
 * @date  2023. 1. 5.
 */
public class Polymorphism_example2 {


	public static void main(String[] args) {
		
		Account account1 = new Account("1111","김기정",1111,10000);
		Account account2 = new Account("1111","김기정",1111,10000);
		System.out.println(account1.equals(account2));
		
		String name = "나";
		System.out.println(account1.equals(name));
		

	}

}
