package com.example.daoservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.daoservice.beans.Quote;

@Repository
public interface DaoRepository extends JpaRepository<Quote, Integer>{
	public List<Quote> findByUserName(String userName);
}
