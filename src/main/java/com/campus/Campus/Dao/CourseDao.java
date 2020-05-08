package com.campus.Campus.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.Campus.Model.Course;
@Repository
public interface CourseDao extends JpaRepository<Course,Integer>{

}
