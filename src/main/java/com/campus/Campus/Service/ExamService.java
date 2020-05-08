package com.campus.Campus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.Campus.Dao.ExamDao;

@Service
public class ExamService {
	
	@Autowired
   private ExamDao dao;	

}
