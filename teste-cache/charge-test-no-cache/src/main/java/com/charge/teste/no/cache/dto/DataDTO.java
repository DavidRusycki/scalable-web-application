package com.charge.teste.no.cache.dto;

import java.util.Date;

import com.charge.teste.no.cache.entity.Data;


@lombok.Data
public class DataDTO {

	private Long id;
	private String content;
	private Date data;
	
	public Data convert(DataDTO dto) {
		Data data = new Data();
		data.setId(dto.getId());
		data.setContent(dto.getContent());
		data.setData(dto.getData());
		
		return data;
	}
	
}
