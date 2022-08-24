package com.j6store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j6store.dao.AccountDAO;
import com.j6store.entity.Account;
import com.j6store.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountDAO adao;

	@Override
	public Account findById(String username) {
		return adao.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		return adao.getAdministratiors();
	}

	@Override
	public List<Account> findAll() {
		return adao.findAll();
	}

}
