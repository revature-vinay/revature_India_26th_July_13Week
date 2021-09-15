package com.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CustomAopProxyObject {

	@Pointcut("execution(* com.app.service.MyService.v*(..))")
	public void myServiceValidMethods() {}
	@Pointcut("execution(* com.app.service.MyService.h*(..))")
	public void myServiceHelloMethod() {}
	@Pointcut("execution(* com.app.service.MyService.t*(..))")
	public void myServiceTMethod() {}
//	
//	
//	@Before("myServiceValidMethods()")
//	public void beforeAdvice(JoinPoint jp) {
//		System.out.println("Before execution of the method : "+jp.getSignature());
//	}
//	//After & AfterThrowing
//	
//	@AfterReturning("myServiceValidMethods()")
//	public void afterAdvice(JoinPoint jp) {
//		System.out.println("After execution of the method : "+jp.getSignature());
//	}
//	@Around("myServiceValidMethods()")
//	public void afterAdvice(ProceedingJoinPoint jp) throws Throwable {
//		System.out.println("Before execution of the method : "+jp.getSignature());
//		jp.proceed(); //executes the actual method
//		System.out.println("After execution of the method : "+jp.getSignature());
//	}
//	@AfterReturning(value="myServiceHelloMethod()", returning="result")
//	public void afterAdvice(JoinPoint jp,String result) {
//		System.out.println("Method which was called is : "+jp.getSignature());
//		System.out.println("Result returned from this method is "+result);
//	}
	
	@AfterThrowing(value="myServiceTMethod()", throwing = "e" )
	public void afterThrowing(JoinPoint jp,Exception e) {
		System.out.println("Method which was called is : "+jp.getSignature());
		System.out.println("Excepttion occured was "+e);
	}
}
