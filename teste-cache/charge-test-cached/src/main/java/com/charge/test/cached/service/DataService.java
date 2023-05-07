package com.charge.test.cached.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.charge.test.cached.entity.Data;
import com.charge.test.cached.repository.DataRepository;

@Service
public class DataService {

	@Autowired
	private DataRepository repository;
	
	@Cacheable("datas")
	public List<Data> getData() {
		List<Data> list = repository.findAll();
		
		return list ;
	}
	
}
