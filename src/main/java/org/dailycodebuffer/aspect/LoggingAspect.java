package org.dailycodebuffer.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // define the point cut (something that we have to run and where we want to run)
    // * -> what ever return type it is
    // call the logger() method before calling checkout method
    @Before("execution(* org.dailycodebuffer.entity.ShoppingCart.checkout(..))")
    public void beforeLogger() {
        System.out.println("Before Logger!");
    }

    @After("execution(* *.*.*.*.checkout(..))")
    public void afterLogger() {
        System.out.println("After Logger!");
    }
}
