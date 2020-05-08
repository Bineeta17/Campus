package com.campus.Campus.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.Campus.Model.Account;

@Repository
public interface AccountDao extends JpaRepository<Account,Integer>{

}
