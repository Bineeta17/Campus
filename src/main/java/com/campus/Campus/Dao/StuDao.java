package com.campus.Campus.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.Campus.Model.Student;




@Repository
public interface StuDao extends JpaRepository<Student,Integer>
{
	Optional<Student> findByName(String name);
}
