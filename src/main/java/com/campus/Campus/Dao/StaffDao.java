package com.campus.Campus.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.Campus.Model.Staff;

@Repository
public interface StaffDao extends JpaRepository<Staff,Integer> {

}
