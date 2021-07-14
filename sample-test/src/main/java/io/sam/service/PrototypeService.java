package io.sam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author zhuweimu
 * @description
 * @date 2021/5/24 14:42
 */
//@Scope(value = "prototype")
@Service
//@DependsOn(value = "testService")
public class PrototypeService {

/*    @Autowired
	TestService testService;*/

	@Scheduled(fixedRate = 10)
    public String test(){
        return "prototype";
    }

}
