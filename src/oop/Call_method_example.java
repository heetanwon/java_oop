package oop;



/**
 * @author 희원
 *
 */
public class Call_method_example {
	
	
	public static void doTask(int x) {
		x += 10;
		System.out.println(x);
		
	}
	//기본데이터타입
	
	
	public static void doTask2(Account account) {
		account.deposit(10000);
		System.out.println(account.getRestMoney());
	}
	//레퍼런스타입
	

	public static void main(String[] args) {
		//Call_method_example e = new Call_method_example();
		//e.doTask(10);
	   //static이 없을시 new는  html 경로 설정해주는 것이랑 비슷한 개념
		int i = 100;
		//Call by Value:i의 값을 메소드에 전달하는것
		doTask(i);
		System.out.println(i);
		
		Account account = new Account("1111-2222", "김희원", 1234, 100000);
		doTask2(account);
		
		System.out.println(account.getRestMoney());
		
	}

}
