package io.sam;

import io.sam.config.MainConfig;
import io.sam.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhuweimu
 * @Date: 2020/9/26 21:28
 * @Description:
 */
public class MainTest {

	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.sam");
		TestService testService = context.getBean(TestService.class);
		System.out.println(testService.test());
	}


}
