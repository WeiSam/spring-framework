package io.sam.processor;

import io.sam.service.cycle.ACycleService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * @author zhuweimu
 * @description
 * @date 2021/7/1 14:29
 */
//@Service
public class AopBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行AopBeanPostProcessor");
/*		if (bean instanceof ACycleService) {
			ACycleService aCycleService = new ACycleService();
			aCycleService.setName("替换bean");
			return aCycleService;
		}*/
		return bean;
	}
}
