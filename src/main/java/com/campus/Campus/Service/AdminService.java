package com.campus.Campus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.Campus.Dao.AdminDao;
import com.campus.Campus.Model.Admin;

@Service
public class AdminService {
	@Autowired
	private AdminDao dao;
	public Admin addAdmin(Admin admin)
	{
		return dao.save(admin);
	}

}
