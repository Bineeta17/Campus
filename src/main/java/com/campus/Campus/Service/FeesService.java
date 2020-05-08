package com.campus.Campus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.Campus.Dao.FeesDao;

@Service
public class FeesService {
	
	@Autowired
	private FeesDao dao;

}
