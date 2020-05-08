package com.campus.Campus.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.Campus.Model.Fees;

@Repository
public interface FeesDao extends JpaRepository<Fees,Integer>{

}
