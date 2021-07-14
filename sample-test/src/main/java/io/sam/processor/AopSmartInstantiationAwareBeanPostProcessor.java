package io.sam.processor;

import io.sam.service.cycle.ACycleService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * @author zhuweimu
 * @description
 * @date 2021/7/6 16:52
 *
 * 存在循环依赖,增强或替换bean,需要实现SmartInstantiationAwareBeanPostProcessor,执行getEarlyBeanReference
 * 不然postProcessAfterInitialization在存在循环依赖的情况,会检测bean是否被替换,
 * 如果bean前后不一致(同时存在两个相同beanName的bean),会报循环依赖错误
 */
@Service
public class AopSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("AopSmartInstantiationAwareBeanPostProcessor");
		if (bean instanceof ACycleService) {
			ACycleService aCycleService = new ACycleService();
			aCycleService.setName("替换bean");
			return aCycleService;
		}
		return bean;
	}
}
