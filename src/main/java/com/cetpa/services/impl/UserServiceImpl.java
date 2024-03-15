package com.cetpa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entities.Account;
import com.cetpa.entities.User;
import com.cetpa.repositories.AccountRepository;
import com.cetpa.repositories.UserRepository;
import com.cetpa.services.UserService;

@Service
public class UserServiceImpl implements UserService 
{
	@Autowired private UserRepository userRepository;
	@Autowired private AccountRepository accountRepository;

	public int saveUser(User user) 
	{
		System.out.println(user);
		userRepository.save(user);
		System.out.println(user);
		Account account=new Account();
		account.setUserid(user.getUserid());
		accountRepository.save(account);
		return account.getAccountno();
	}
	public User getUser(String userid) 
	{
		User user=userRepository.findById(userid).orElse(null);
		return user;
	} 
}
