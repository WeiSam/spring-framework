package io.sam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

/**
 * @author: zhuweimu
 * @Date: 2020/9/26 20:20
 * @Description:
 */
@Service
//@DependsOn(value = "prototypeService")
public class TestService implements TestInterface{

	@Autowired
	TestService testService;

	@Autowired
	PrototypeService prototypeService;

//	@Override
	public String test(){
		System.out.println("io.sam.service.TestService.test");
		return "78238";
	}
}
