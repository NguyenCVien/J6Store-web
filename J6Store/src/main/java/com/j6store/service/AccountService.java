package com.j6store.service;

import java.util.List;

import com.j6store.entity.Account;

public interface AccountService {
	
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();
}
