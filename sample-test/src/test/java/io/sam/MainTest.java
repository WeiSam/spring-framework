package io.sam;

import io.sam.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhuweimu
 * @classname MainTest
 * @description
 * @date 2020/9/25 11:33
 */
public class MainTest {

	@Autowired
	TestService testService;

	@Test
	public void testBean(){
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.register(TestService.class);
//		ctx.refresh();
//		TestService testService1 = ctx.getBean(TestService.class);
//		System.out.println(testService.getTest());
		System.out.println("djksjd");
	}
}
