package com.tritux.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tritux.entity.Etudiant;
import com.tritux.entity.TestHBC;
import com.tritux.entity.User;
import com.tritux.persistence.dao.EtudiantRepository;
import com.tritux.persistence.dao.TestHBCRepository;
import com.tritux.persistence.dao.UserRepository;
@Service
public class TestHBCServiceImpl implements TestHBCService {

	@Autowired
	TestHBCRepository testHBCRepository;
	
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Autowired
	UserRepository userRepository;

	public List<TestHBC> findAll() {
		return testHBCRepository.findAll();
	}

	public TestHBC findOne(Long arg0) {
		return testHBCRepository.findOne(arg0);
	}

	public TestHBC getOne(Long arg0) {
		return testHBCRepository.getOne(arg0);
	}

	public TestHBC saveAndFlush(TestHBC arg0) {
		return testHBCRepository.saveAndFlush(arg0);
	}

	public void delete(Long arg0) {
		testHBCRepository.delete(arg0);

	}

	public void delete(TestHBC arg0) {
		testHBCRepository.delete(arg0);
	}
	public void addTestHBCInetudiant() {
		TestHBC hbc=	testHBCRepository.findAll().get(0);
		Etudiant arg0 = new Etudiant();
		arg0.setId(hbc.getId().toString());
		arg0.setLabel(hbc.getLabel());
		etudiantRepository.save(arg0);
		
		}

	@Override
	public void addUser(User user) {
		userRepository.saveAndFlush(user);
	}
	
}
