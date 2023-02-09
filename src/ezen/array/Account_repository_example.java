package ezen.array;

import oop.Account;
import oop.Minus_account;

/**
 * @author 김희원 2023. 1. 3. 애플리케이션 실행을 위한 역할 - 애플리케이션(메인) 클래스
 */
public class Account_repository_example {

	public static void main(String[] args) {
		Account_Repository repository = new Account_Repository(100);
		//입출금 신규계좌 생성 테스트
		Account account = new Account("1111-2222", "김기정", 1111, 100000);
		repository.addAccount(account);
		// 값을 더해줘
		// 신규 계좌 등록
		repository.addAccount(new Account("1111-3333", "홍길동", 1111, 100000));
		repository.addAccount(new Account("1111-4444", "박찬호", 1111, 100000));
		
		//마이너스 신규 계좌 등록  
		Minus_account ma =
		new Minus_account("2222-1111", "김대출",1111, 10000, 10000000,"22.1.05");
		//자동형변환
		repository.addAccount(ma);
		repository.addAccount(new Minus_account("2222-2222","김왈왈",1234,20000,100000000, "22.1.6"));
		
		
		
		// 전체 계좌 목록 조회
		System.out.println("------전체 계좌 목록--------");
		Account[] list = repository.getAccounts();
		for (int i = 0; i < repository.getCount(); i++) {
			System.out.println(list[i].toString());
		}

		// 계좌번호로 계좌 검색 테스트
		System.out.println("------계좌 검색--------");
		Account findAccount = repository.findByNumber("1111-2222");
		if (findAccount != null) {
			System.out.println(findAccount.toString());
		} else {
			System.out.println("해당 계좌가 존재하지 않습니다");
		}

		// 계좌번호로 계좌 삭제 테스트
		System.out.println("--------계좌 삭제--------");
		boolean result = repository.removeAccount("1111-3333");
		if (result) {
			System.out.println("정상 삭제 되었습니다");
			System.out.println(repository.getCount());

		} else {
			System.out.println("삭제하고자 하는 계좌가 존재하지 않습니다");
		}

		System.out.println("------전체 계좌 목록--------");
		list = repository.getAccounts();
		for (int i = 0; i < repository.getCount(); i++) {
			System.out.println(list[i].toString());
		}
		
		repository.addAccount(new Account("1111-7777","박찬울", 1111, 10000));
		
		
		System.out.println("------전체 계좌 목록--------");
		list = repository.getAccounts();
		for (int i = 0; i < repository.getCount(); i++) {
			System.out.println(list[i].toString());
		}
		
		
		
		

	}

}