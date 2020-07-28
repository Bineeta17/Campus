package com.campus.Campus.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.campus.Campus.Dao.AdminDao;
import com.campus.Campus.Dao.AdminLoginDao;
import com.campus.Campus.Model.Admin;
import com.campus.Campus.Model.AdminLogin;

@Service
public class AdminService {
	@Autowired
	private AdminDao dao;
	@Autowired
	private AdminLoginDao logindao;
	public Admin addAdmin(@RequestBody Admin admin)
	{ 
		AdminLogin login=new AdminLogin();
		//Admin admin=new Admin();
		login.setId(admin.getName());
		login.setPassword(admin.getEmail());
	//	logindao.save(login);
	//	admin.setAdminLogin(logindao.save(admin.getAdminLogin()));
		admin.setAdminLogin(logindao.save(login));
		return dao.save(admin);
	}
//	public List<Admin> Login(@PathVariable String id,@PathVariable String password)
//	{
//		AdminLogin login=new AdminLogin();
//		Admin admin=new Admin();
//		login.setId(admin.getName());
//		login.setPassword(admin.getEmail());
//		logindao.save(login);
//		
//		return dao.findAll();
//	}

}
