package com.campus.Campus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.Campus.Dao.ResultDao;

@Service
public class ResultService {
	
	@Autowired
	private ResultDao dao;

}
