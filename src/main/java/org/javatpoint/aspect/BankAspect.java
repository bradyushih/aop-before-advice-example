package org.javatpoint.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Brad Shih on 2023/7/3
 * @project aop-before-advice-example
 */
//Enables the spring AOP functionality in an application
@Aspect
@Component
@Order(1)
public class BankAspect {
    @Before(value = "execution(* org.javatpoint.service.BankService.*(..))")
    private void beforeBank(){
        System.out.println("before BankService");
    }

    //Displays all the available methods i.e. the advice will be called for all the methods
    @Pointcut(value= "execution(* org.javatpoint.service.BankService.*(..))")
    private void logDisplayingBalance()
    {
    }
    //Declares the around advice that is applied before and after the method matching with a pointcut expression
    @Around(value= "logDisplayingBalance()")
    public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable
    {
        System.out.println("The method aroundAdvice() before invokation of the method " + jp.getSignature().getName() + " method");
        try
        {
            jp.proceed();
        }
        finally
        {

        }
        System.out.println("The method aroundAdvice() after invokation of the method " + jp.getSignature().getName() + " method");
    }

    @After(value = "execution(* org.javatpoint.service.BankService.*(..))")
    private void afterBank(){
        System.out.println("after BankService");
    }
}
