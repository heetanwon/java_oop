package setget;

import java.util.Scanner;

public class ArrayMain {


	

	public static void main(String[] args) {
		
		
		new String();
		int[] jumsu = new int[4];
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름 입력:");
		scanner.nextLine();
		
		System.out.print("점수 입력:");
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = scanner.nextInt();
			scanner.close();
		}
		
		
	
		
		
		Student student= new Student();
		
		System.out.println("총점은?"+student.getSum());	
		//System.out.println("평균은?"+student.getAvg());
		
  }
	
}
