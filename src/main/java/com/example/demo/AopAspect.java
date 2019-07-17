package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@Aspect
public class AopAspect {

	private static final Logger log = LoggerFactory.getLogger(AopAspect.class);
	
	@Around("within(com.example.demo..*)")
	public void beforeMethod(ProceedingJoinPoint pjp) throws Throwable {
		log.info("Started {}.{}({})", pjp.getSignature().getDeclaringType(), pjp.getSignature().getName(),pjp.getArgs());
		Object returnValue = pjp.proceed();
		log.info("Finished {}.{}({})", pjp.getSignature().getDeclaringType(), pjp.getSignature().getName(),pjp.getArgs());
		log.info("Returning {}", returnValue);
	}
}
