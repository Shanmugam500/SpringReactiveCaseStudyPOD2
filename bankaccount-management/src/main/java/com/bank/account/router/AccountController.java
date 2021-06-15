package com.bank.account.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.account.model.Account;
import com.bank.account.service.AccountService;

import reactor.core.publisher.Mono;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("/createAccount")
	public Mono<Account> createAccount(@RequestBody Account account){
		
		return  accountService.createAccount(account);
	}

}
