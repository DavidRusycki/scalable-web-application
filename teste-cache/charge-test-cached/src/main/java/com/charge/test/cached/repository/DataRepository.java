package com.charge.test.cached.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.charge.test.cached.entity.Data;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
 
}
