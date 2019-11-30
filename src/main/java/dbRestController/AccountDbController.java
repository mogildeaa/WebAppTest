package dbRestController;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Account;
import services.AccountService;

@RestController
@RequestMapping(value = "/rest")
public class AccountDbController {

	@Autowired
	AccountService accountService;
	
	@GetMapping(value="/all")
	public Set<Account> getAccounts(){
		System.out.println("S-a apelat getAccounts");
		return accountService.getAccounts();
	}

	@GetMapping(value="/{userId}")
	public Account getAccount(@PathVariable("userId") String userId){
		System.out.println("S-a apelat getAccount");
		return accountService.getAccount(Integer.parseInt(userId));
	}
	
	//Create / Update if exist
	@PostMapping(value = "/create")
	public Account createAccount(Account acc){
		System.out.println("S-a creat account");
		return accountService.createAccount(acc);
	}	
	
	@GetMapping(value = "/delete/{id}")
	public void deleteAccount(@PathVariable ("id") String id) {
		System.out.println("S-a sters un account");
		accountService.deleteAccount(Integer.parseInt(id));
	}
	
}
