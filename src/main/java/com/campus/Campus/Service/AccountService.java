package com.campus.Campus.Service;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.Campus.Dao.AccountDao;
import com.campus.Campus.Dao.StuDao;
import com.campus.Campus.Model.Account;
import com.campus.Campus.Model.Student;

@Service
public class AccountService {

	@Autowired
	private AccountDao dao;

	@Autowired
	private StuDao stuDao;

	public Account payFee(Student student,String modeOfPayment,String batch) {
		student = stuDao.findById(student.getStu_id()).get();
		if (student == null)
			return null;
		else {
			Account account = new Account();
			account.setModeOfPayment(modeOfPayment);
			account.setStudent(student);
			account.setDate(new Date());
			account.setBatch(batch);
			account.setCourse(student.getCourse());
			account.setAmount(student.getCourse().getFee().getTotal());
			dao.save(account);
			return account;
		}
	}
}
