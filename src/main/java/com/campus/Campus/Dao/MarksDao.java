package com.campus.Campus.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.Campus.Model.Marks;

@Repository
public interface MarksDao extends JpaRepository<Marks,Integer>{

}
