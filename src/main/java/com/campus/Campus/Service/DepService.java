package com.campus.Campus.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.campus.Campus.Dao.DepDao;
import com.campus.Campus.Dao.StaffDao;
import com.campus.Campus.Model.Department;
import com.campus.Campus.Model.Staff;

import springfox.documentation.schema.Example;


@Service
public class DepService {
	
	@Autowired
	private DepDao dao;
	@Autowired
	private StaffDao staffDao;
	
	public Department add(Department dept)
	{
		 if(!dao.findById(dept.getD_id()).isPresent())
		 {
			 //New Department
			 System.out.println("If Part");
			 for(Staff staff:dept.getStaff())
			 {
				 staffDao.save(staff);
			 }
			 return dao.save(dept);
		 }
		 else
		 {
			 //Old Department 
			 System.out.println("Else Part");
			 Department deptno=dao.findById(dept.getD_id()).get();
			 for(Staff staff:dept.getStaff())
			 {
				 deptno.getStaff().add(staffDao.save(staff));
			 }
			 dao.save(deptno);
			 return dept;
		 }
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
