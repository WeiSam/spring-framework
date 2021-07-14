package io.sam.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author zhuweimu
 * @description
 * @date 2021/6/21 14:56
 */
@Service()
public class TestServiceExt implements TestInterface{

	private String name;

	public TestServiceExt() {
	}

	public TestServiceExt(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
	public String test() {
		return null;
	}
}
