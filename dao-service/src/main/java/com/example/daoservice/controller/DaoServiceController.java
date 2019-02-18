package com.example.daoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.daoservice.beans.Quote;
import com.example.daoservice.beans.Quotes;
import com.example.daoservice.repository.DaoRepository;

@RestController
public class DaoServiceController {
	@Autowired
	DaoRepository daoRepository;
	
	@GetMapping("/get/{userName}")
	public List<Quote> getQuote(@PathVariable String userName) {
		List<Quote> quotes = daoRepository.findByUserName(userName);
		return quotes;
	}
	
	@PostMapping("/add")
	public List<Quote> postQuote(@RequestBody final Quotes quotes) {
		
		quotes.getQuotes().stream()
		.map(quote->new Quote(quotes.getUserName(),quote))
		.forEach(quote->daoRepository.save(quote));
		return daoRepository.findByUserName(quotes.getUserName());
		
	}
}
