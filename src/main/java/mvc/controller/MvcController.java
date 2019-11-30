package mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import services.AccountService;


@Controller
public class MvcController {
	
	@Autowired
	AccountService accountService;

	@GetMapping("/p")
	public String displayLogin() {
		System.out.println("Se logheaza!");
		return "login";
	}
	
	@GetMapping("/signup")
	public String displaySignup() {
		System.out.println("Nu are cont! S-a dus la sing-up!");
		return "signup";
	}

	
}
