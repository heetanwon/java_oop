package ezen.array;


import java.util.Scanner;

import oop.Account;

/**
 * @author 김희원
 *2023. 1. 2.
 *배열을 이용한 계좌 관리
 */
public class Array_example7 {

	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		int index= 0;
		//계좌 개설
		Account account1 = new Account("1111-2222","김기정",1111,100000);
		
		//배열에 계좌 등록 
		accounts[index++] = account1;
		accounts[index++] = new Account("1111-3333","김철수",1111,10000);
		accounts[index++] = new Account("1111-4444","홍길동",1111,10000);
		
		
		//등록된 모든 계좌정보 출력
		for (int i = 0; i < accounts.length; i++) {
			Account acc = accounts[i];
			//계좌번호 예금주명 *****잔액 
			String description = acc.getAccountNumber()+"\t"+acc.getAccountOwner()+
								"\t*****\t"+acc.getRestMoney();
			System.out.println(description);
		}
		
		System.out.println("-----계좌검색테스트------");
		
		
		//계좌번호로 계좌 검색 
		//String searchNum = "1111-2222";
		String searchNum = null;
		System.out.print("검색하고자 하는 계좌번호:");
		Scanner scanner = new Scanner(System.in);
		searchNum = scanner.nextLine();
		scanner.close();
		//nextLine 대표적인 블럭메소드 
		
		
		
			for (int i = 0; i < index; i++) {
				String number =accounts[i].getAccountNumber();
				if(searchNum.equals(number)){
					System.out.println(accounts[i].toString());
				}
				
				//String name1 = new String("김기정");
				//String name1 = new String("김기정");
				//System.out.println(name1==name2);//주소값 비교
				//name1.equals(name2);
				//System.out.println(name1.equals(name2));//객체의 문자열 값 비교
			}

	}

}
