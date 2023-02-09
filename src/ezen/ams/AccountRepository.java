package ezen.ams;



/**
 * @author 김희원
 *2023. 1. 2.
 *계좌 저장소 객체
 *여러개의 계좌를 저장하고 관리(추가,검색,수정,삭제)하는 역할의 클래스
 */
public interface AccountRepository {
	   /** 전체 계좌 개수 반환 */
	   public int getCount();
	   
	   /** 계좌 등록 */
	   public void addAccount(Account account) ;
	   
	  
	   
	   /** 전체 계좌 조회 */
	   public Account[] getAccounts();
	   
	   /** 계좌번호로 계좌 검색 */
	   public Account findByNumber(String number);
	   
	   /** 계좌번호로 계좌 삭제 */
	   public boolean removeAccount(String number);
	  
	   
	}