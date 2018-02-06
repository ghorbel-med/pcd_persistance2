package com.tritux.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tritux.entity.TestHBC;

@Repository("testHBCRepository")
public interface TestHBCRepository extends JpaRepository<TestHBC, Long> {
	

}
