package com.j6store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j6store.dao.AccountDAO;
import com.j6store.dao.AuthorityDAO;
import com.j6store.entity.Account;
import com.j6store.entity.Authority;
import com.j6store.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService {
	@Autowired
	AuthorityDAO dao;
	
	@Autowired
	AccountDAO acdao;

	@Override
	public List<Authority> findAll() {
		return dao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return dao.save(auth);
	}

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acdao.getAdministratiors();
		return dao.authoritiesOf(accounts);
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}

}
