package com.campus.Campus.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.Campus.Model.Result;

@Repository
public interface ResultDao extends JpaRepository<Result,Integer>{

}
