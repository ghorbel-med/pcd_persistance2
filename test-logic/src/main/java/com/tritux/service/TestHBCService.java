package com.tritux.service;

import java.util.List;

import com.tritux.entity.TestHBC;
import com.tritux.entity.User;

public interface TestHBCService {
	
	public List<TestHBC> findAll();

	public TestHBC findOne(Long arg0);

	public TestHBC getOne(Long arg0);

	public TestHBC saveAndFlush(TestHBC arg0);

	public void delete(Long arg0);

	public void delete(TestHBC arg0);
	
	public void addUser(User user);
	

}
