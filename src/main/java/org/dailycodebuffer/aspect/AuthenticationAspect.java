package org.dailycodebuffer.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(org.dailycodebuffer..*)")
    public void authenticatingPointCut() {
        System.out.println();
    }

    @Pointcut("within(org.dailycodebuffer..*)")
    public void authorizationPointCut() {
        System.out.println( );
    }

    // calling point cuts
    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate() {
        System.out.println("Authentication the request:");
    }
}
