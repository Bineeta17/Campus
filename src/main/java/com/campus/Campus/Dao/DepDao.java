package com.campus.Campus.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.Campus.Model.Department;


@Repository
public interface DepDao extends JpaRepository<Department,Integer>{
	///public String findByd_name(String d_name);
}
