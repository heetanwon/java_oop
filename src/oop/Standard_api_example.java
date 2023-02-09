package oop;




public class Standard_api_example {

	public static void main(String[] args) {
		//String message = "안녕하세요 김희원입니다";
		String message = new String("안녕하세요 김희원입니다");
		int count = message.length();
		
		
		//System.out.println("총"+message.length()+"개로 구성되었습니다");
		System.out.println("총"+count+"개로 구성되었습니다");
		
		//주민번호는 대개 문자열 타입 
		String ssn = new String("000000-1111111");
		char ch = ssn.charAt(7);
		switch (ch) {
		case '1': System.out.println("2000년 이전 출생 남자"); break;
		case '2': System.out.println("2000년 이전 출생 여자"); break;
		case '3': System.out.println("2000년 이후 출생 여자"); break;
		case '4': System.out.println("2000년 이후 출생 여자"); break;
		default: System.out.println("외국인");
		}
		
		
		System.out.println(10/0);
		
		int number = 1234567;
		String numStr = String.valueOf(number);
		int c = numStr.length();
		System.out.println(c);
		
		int n = -10;
		//양수로 바꿔서 출력 
		int result = Math.abs(n);
		System.out.println(result);
		//math는 static mathod만 가지고 있음(전세계 공통이기때문에)
		
		double radian = 45.3;
		double re = 2 * Math.PI * radian; //원의 둘레 
		System.out.println(re);
		
		
		
	}
}
