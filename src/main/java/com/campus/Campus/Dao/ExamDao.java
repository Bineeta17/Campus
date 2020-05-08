package com.campus.Campus.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.Campus.Model.Exam;

@Repository
public interface ExamDao extends JpaRepository<Exam,Integer>{

}
