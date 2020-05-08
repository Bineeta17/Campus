package com.campus.Campus.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campus.Campus.Dao.MarksDao;

@Service
public class MarksService {

	@Autowired
	private MarksDao dao;
}
