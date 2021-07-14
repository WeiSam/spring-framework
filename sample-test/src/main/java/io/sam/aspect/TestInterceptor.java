package io.sam.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author zhuweimu
 * @classname DistributedLockInterceptor
 * @description
 * @date 2020/9/21 16:20
 */
@Component
@Aspect
public class TestInterceptor {

    @Around("execution(* io.sam.service.*.*(..))")
    public Object interceptor(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("==============准备执行===============");
        Object proceed = pjp.proceed();
		System.out.println("==============执行结束===============");
        return proceed;
    }
}
