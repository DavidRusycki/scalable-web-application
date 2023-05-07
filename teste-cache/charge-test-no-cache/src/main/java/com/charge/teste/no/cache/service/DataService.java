package com.charge.teste.no.cache.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charge.teste.no.cache.entity.Data;
import com.charge.teste.no.cache.repository.DataRepository;

@Service
public class DataService {

	@Autowired
	private DataRepository repository;
	
	public List<Data> getData() {
		List<Data> list = repository.findAll();
		
		return list ;
	}
	
}
