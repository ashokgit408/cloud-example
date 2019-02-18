package com.example.daoservice.config;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.daoservice.beans.Quote;
import com.example.daoservice.repository.DaoRepository;

@Configuration
public class Config {
	/*@Bean
	public DaoRepository getDaoRepository() {
		return new DaoRepository();
	}*/
}
