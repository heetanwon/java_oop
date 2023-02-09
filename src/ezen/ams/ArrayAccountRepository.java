package ezen.ams;



public class ArrayAccountRepository implements AccountRepository {
	   
	   private Account[] accounts;
	   private int count;
	   
	   
	   public ArrayAccountRepository() {
	      this(10);
	   }

	   public ArrayAccountRepository(int capacity) {
	      this.accounts = new Account[capacity];
	   }
	   
	   @Override
	   public int getCount() {
	      return count;
	   }

	   @Override
	   public void addAccount(Account account) {
	      accounts[count++] = account;

	   }

	   @Override
	   public Account[] getAccounts() {
	      return accounts;
	   }

	   @Override
	   public Account findByNumber(String number) {
	      for (int i = 0; i < count; i++) {
	         String an = accounts[i].getAccountNumber();
	         if (an.equals(number)) {
	            return accounts[i];
	         }
	      }
	      return null;
	   }

	   @Override
	   public boolean removeAccount(String number) {
	      for (int i = 0; i < count; i++) {
	         String an = accounts[i].getAccountNumber();
	         if (an.equals(number)) {
	            for (int j = i; j < count - 1; j++) {
	               accounts[j] = accounts[j + 1];
	            }
	            count--;
	            return true;
	         }
	      }
	      return false;
	   }

	}