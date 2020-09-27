package io.sam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuweimu
 * @classname service
 * @description
 * @date 2020/9/25 11:32
 */
@Service
public class TestService {

	@Autowired
	public TestService() {
		new TestService();
	}

	public String getTest(){
		return "test";
	}
}
