package com.campus.Campus.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.campus.Campus.Dao.DepDao;
import com.campus.Campus.Model.Department;


@Service
public class DepService {
	
	@Autowired
	private DepDao dao;
	
	public Department add(Department dept)
	{
		return dao.save(dept);
	}

	
	public void deleteDepartment(int id)
	{
		dao.deleteById(id);
	}
	
	public List<Department> getDept()
	{
		return dao.findAll();
	}
	
	public int getDepartmentName(int id)
	{
		 dao.findById(id);
		 return id;
	}
	
	public Department update(@RequestBody Department dept)
		{
			 dao.save(dept);
			 return dept;
	}
	
	
	
	
}
