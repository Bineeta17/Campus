package com.campus.Campus.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.Campus.Model.Admin;
@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {

}
