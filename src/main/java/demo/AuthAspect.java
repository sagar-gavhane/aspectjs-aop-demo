package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class AuthAspect {
    @Pointcut("execution(public * *(..)")
    public void authenticatePointcut() {
        System.out.println("authenticating executing...");
    }

    @Pointcut("within(demo.*.*)")
    public void authorizePointcut() {
        System.out.println("authorizing executing...");
    }

    @Before("authenticatePointcut())")
    public void auth() {
        System.out.println("auth executing...");
    }
}
