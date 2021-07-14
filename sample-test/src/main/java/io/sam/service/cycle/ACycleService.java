package io.sam.service.cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuweimu
 * @description
 * @date 2021/7/1 14:32
 */
@Service
public class ACycleService {

	private String name = "AA";
	@Autowired
	ACycleService aCycleService;

	public String getName(){
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
