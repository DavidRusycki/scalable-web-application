package com.charge.test.cached.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charge.test.cached.dto.DataDTO;
import com.charge.test.cached.service.DataService;

@RestController
@RequestMapping("/data")
public class ControllerRest {

	@Autowired
	private DataService service;
	
	@GetMapping
	public List<DataDTO> getData() {
		return service.getData().stream().map(data -> data.convert(data)).collect(Collectors.toList());
	}
	
}
