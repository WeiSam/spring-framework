package io.sam;

import io.sam.config.MainConfig;
import io.sam.service.TestInterface;
import io.sam.service.TestService;
import io.sam.service.TestServiceExt;
import io.sam.service.cycle.ACycleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhuweimu
 * @Date: 2020/9/26 21:28
 * @Description:
 */
public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.sam");
//		TestServiceExt testServiceExt = (TestServiceExt) context.getBean("testServiceExt", "yuda");
//		TestService testService = (TestService)context.getBean("testService");
//		ACycleService aCycleService = (ACycleService) context.getBean("ACycleService");
//		System.out.println(aCycleService.getName());
//		System.out.println("构造函数单例:testServiceExt.name = "+testServiceExt.getName());

		Object bean = context.getBean("testService");
		TestService testService = (TestService) bean;
		testService.test();
	}


}
