package io.sam.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author zhuweimu
 * @classname DistributedLockInterceptor
 * @description
 * @date 2020/9/21 16:20
 */
@Component
@Aspect
public class TestBeforeInterceptor {

    @Before("execution(* io.sam.service.*.*(..))")
    public void interceptor(JoinPoint joinPoint) throws Throwable {
		System.out.println("==============准备执行(TestBeforeInterceptor)===============");
    }
}
