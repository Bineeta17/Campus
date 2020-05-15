package com.campus.Campus.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.Campus.Dao.FeesDao;
import com.campus.Campus.Model.Course;
import com.campus.Campus.Model.Fees;

@Service
public class FeesService {
	
	@Autowired
	private FeesDao dao;
	
	public Fees AddFees(Fees fees)
	{
		fees.setTotal();
		dao.save(fees);
		return fees;
	}
	public List<Fees> GetAll()
	{
		return dao.findAll();
	}
}
