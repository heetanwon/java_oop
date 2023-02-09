package ezen.array;

import oop.Account;

/**
 * @author 김희원
 *2023. 1. 2.
 *계좌 저장소 객체
 *여러개의 계좌를 저장하고 관리(추가,검색,수정,삭제)하는 역할의 클래스
 */
public class Account_Repository {
	//다형성 up casting
	private Account[] accounts;
	private int count;
	//필드
	//인스턴스 변수는 자동으로 초기화 됨
	
	public Account_Repository(){
		this(10);
	}
	//default 생성자
	
	public Account_Repository(int capacity){
		this.accounts = new Account[capacity];
	}
	//생성할때 몇개짜리 배열을 만들거냐
	

	public Account[] getAccounts() {
		return accounts;
	}
	//계좌목록
	
	public int getCount() {
		return count;
	}
	//계좌의 개수
	
	//계좌 등록 기능 
	public void addAccount(Account account){
		accounts[count++] = account;
		//계좌정보를 매번 0에 담으면 안되므로 인스턴스 변수 count를 설정해줘서 
		//차곡차곡 쌓이게 하는 방식
	}
	
	
	
	
	
	
	
	//계좌 검색 기능 
	public Account findByNumber(String number) {
		for (int i = 0; i < count; i++) {
			String an =accounts[i].getAccountNumber();
			//동일 계좌번호 여부 확인
			if(an.equals(number)) {
			   return accounts[i];
			}
		}
		return null;
	}
	
	//계좌 삭제 기능
	public boolean removeAccount(String number){
		for (int i = 0; i < count; i++) {
			String aa = accounts[i].getAccountNumber();
			if(aa.equals(number) ) {
				for (int j = i; j < count-1; j++) {
					accounts[j] = accounts[j+1];
				}
				count --;
				return true;
			}
			
		}
		
		 		return false;
	}
	
	
	
	
	
	//삭제 알고리즘 
	

	//public void setAccounts(Account[] accounts) {
		//this.accounts = accounts;
	//}
	//값을 새로 설정해주는 것이기 때문에 위험 부담이 있음. 프로그램 로직상
	//세터가 없어도 되는거면 과감하게 삭제해도 상관이 x.
	
	
	
	
	
	
	
	
	
}
