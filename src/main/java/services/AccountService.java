package services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Account;
import repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
//	getAccounts
	public Set<Account> getAccounts(){
		Set<Account> result = new HashSet<Account>();
		for(Account acc: accountRepository.findAll()) {
			result.add(acc);
		}
		return result;
	}
	
//	getAccount
	public Account getAccount(int userId){
		Account account = new Account();
		for (Account acc: accountRepository.findAll()) {
			if(acc.getUserId() == userId) {
				account = acc;
			}
		}
		return account;
	}
	
//	createAccount or update
	public Account createAccount(Account acc) {
		accountRepository.save(acc);
		return acc;
	}
	
//	deleteAccount
	public void deleteAccount(int id) {
		for(Account acc: accountRepository.findAll()) {
			if(acc.getUserId() == id) {
				accountRepository.delete(acc);
			}
		}
	}
}
