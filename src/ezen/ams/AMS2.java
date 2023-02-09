package ezen.ams;

public class AMS2 {

	public static void main(String[] args) {
		//데이터 담당
		AccountRepository repository = new ArrayAccountRepository(100);
		//인터페이스 					//구현 클래스
		
		//가상데이터 등록
		repository.addAccount(new Account("1111-2222-3333","김기정", 1111, 100000));
		repository.addAccount(new MinusAccount("2222-3333-4444","김대출", 1111, 100000, 10000000, "2023-01-17"));
		
		
		
		//화면담당
		AccountFrame frame = new AccountFrame(Account.BANK_NAME+ " AMS", repository);
		frame.initLayout();
		frame.addEventListener();
		frame.setSize(400,400);
		frame.setVisible(true);
		
		
		
		

	}

}
