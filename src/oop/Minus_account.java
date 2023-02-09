package oop;
/**
 * Account 클래스를 상속받는 마이너스 계좌 
 * @author 김희원
 * @date   2023. 1. 4.
 *
 */
public class Minus_account extends Account {
	//새롭게 추가된 속성(대출금액)
	private long borrowMoney;
	//대출 일자 
	private String borrowDate;
	
	public Minus_account() {}

	public Minus_account(String number, String owner, int passwd, long money, long borrowMoney, String borrowDate) {
		super(number, owner, passwd, money);
		this.borrowMoney = borrowMoney;
		this.borrowDate = borrowDate;
		
	}

	public long getBorrowMoney() {
		return borrowMoney;
	}

	public void setBorrowMoney(long borrowMoney) {
		this.borrowMoney = borrowMoney;
	}

	public String getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	
	//잔액(restmoney-borrowmoney) 재정의(Overriding)
	public long getRestMoney() {
		return super.getRestMoney() - borrowMoney;
	}
	
	//=@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "\t"+borrowMoney+"\t"+borrowDate;
		
	}
	
	
	
	
		
}
