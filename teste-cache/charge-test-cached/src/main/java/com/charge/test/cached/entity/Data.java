package com.charge.test.cached.entity;

import java.util.Date;

import com.charge.test.cached.dto.DataDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@lombok.Data
public class Data {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String content;
	private Date data;
	
	public DataDTO convert(Data data) {
		DataDTO dto = new DataDTO();
		dto.setId(data.getId());
		dto.setContent(data.getContent());
		dto.setData(data.getData());
		
		return dto;
	}
	
}
