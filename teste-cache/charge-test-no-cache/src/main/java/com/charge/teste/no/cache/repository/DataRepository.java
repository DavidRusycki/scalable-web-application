package com.charge.teste.no.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charge.teste.no.cache.entity.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
	
}
