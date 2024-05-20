package com.hoangnd.web.service;

import java.util.List;

import com.hoangnd.web.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hoangnd.web.model.AccountDetails;
import com.hoangnd.web.repository.AccountRepository;

@Service
public class AccountService implements UserDetailsService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	
	public List<Account> findAll(){
		return accountRepository.findAll();
	}
	
	public Account findByUsername(String username) {
		return accountRepository.findByUsername(username);
	}
	
	public Account save(Account account) {
		return accountRepository.save(account);
	}
	
	
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Account account = accountRepository.findByUsername(userName);
		if (account == null) {
			throw new UsernameNotFoundException("Tài khoản không tồn tại");
		}
		return new AccountDetails(account);
	}

}
