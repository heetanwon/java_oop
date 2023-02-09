package ezen.ams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

public class MapAccountRepository {
	   
	   private Map<String ,Account> accounts;
	   
	   
	   public MapAccountRepository() {
	      accounts = new HashMap<>();
	     
	   }
	   
	
	   
	   public void addAccount(Account account) throws RuntimeException {
		   if(accounts.containsKey(account.getAccountNumber())) {
			   throw new RuntimeErrorException(null, "이미 등록된 계좌입니다");
		   }else {
			  accounts.put(account.getAccountNumber(), account);
		   		}
		   }
		   
	   

	  
	   public List<Account> getAccounts() {
		   return new ArrayList<>(accounts.values());
		}
		  
	   
	   

	   public Account findByNumber(String number) {
		  return accounts.get(number);
	   }

	   

	   public boolean removeAccount(String number){
		   Account removeAccount = accounts.remove(number);
		   if(removeAccount != null) {
			return true;
		   }
		   	return false;
	   }

	}