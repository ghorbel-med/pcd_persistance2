package com.tritux.smgs_logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.tritux.configuration.TestLogicConfig;
import com.tritux.entity.TestHBC;
import com.tritux.service.TestHBCService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestLogicConfig.class)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class,
		TransactionDbUnitTestExecutionListener.class })
public class AppTest {

	@Autowired
	private TestHBCService testHBCService;

	
	@Test
	public void createTestHBC()  {
		TestHBC test=new TestHBC();
		test.setLabel("hbc");
		
		testHBCService.saveAndFlush(test);
	}

	
}