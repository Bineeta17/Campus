package com.campus.Campus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.Campus.Dao.AccountDao;

@Service
public class AccountService {

	@Autowired
	private AccountDao dao;
}
