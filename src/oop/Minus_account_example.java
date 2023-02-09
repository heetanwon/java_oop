package oop;

import javax.swing.JOptionPane;

public class Minus_account_example {

	public static void main(String[] args) {
		Minus_account ma;
		ma = new Minus_account("1111-2222", "김희원", 1111, 10000, 10000000, "2021.01.04");
		
		//부모 메소드 재사용 
		System.out.println(ma.getAccountNumber());
		System.out.println(ma.getAccountOwner());
		ma.deposit(1000000);
		ma.withraw(1000);
		System.out.println("현재 잔액:"+ma.getRestMoney());
		System.out.println(ma.toString());
		System.out.println(ma);
		//메소드는 jvm에 의해 자동 호출 된다
		
		
		JOptionPane.showMessageDialog(null, ma.toString());
		
		//새롭게 추가된 메소드 사용
		System.out.println(ma.getBorrowMoney());
		System.out.println(ma.getBorrowDate());
		
		//object의 메소드 재사용
		
		int code = ma.hashCode();
        System.out.println(code);
        System.out.println(ma.toString());
        
        String name = "김기정";//new String("김기정");
        System.out.println(name);// String 클래스에 재정의된 toString() 메소드 자동 호출
        System.out.println(name.toString());
        
        
        // object 클래스는 equals()메소드를 기본 제공
        //레퍼런스 비교 
        
        Account account1 = new Account("1111","김기정",1111,10000);
        Account account2 = new Account("1111","김기정",1111,10000);
        System.out.println(account1 == account2);
        //레퍼런스 타입이므로 주소끼리 비교해서 false가 나온다
        //object의 equals()메소드 재사용 
        System.out.println(account1.equals(account2));
        //object도 마찬가지로 주소값 비교
        
        String message1 = "자바 어려워요.";
        String message2 = "자바 어려워요.";
        System.out.println(message1.equals(message2));
        //여기서 유추할 수 있는 것 .
        //String 클래스는 Object가 제공하는 equals()메소드를 재사용하는 것이
        //아니라 equals() 메소드를 재정의하며 문자열과 문자열을 비교한다.ㅣ
        
        
        
        
        
		
		

	}

}
