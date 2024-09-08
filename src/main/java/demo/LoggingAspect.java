package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint joinPoint) {
        System.out.println("received arg: "+joinPoint.getArgs()[0].toString());
        System.out.println("before logger method executing...");
    }

    @After("execution(* demo.*.checkout(..))")
    public void afterLogger() {
        System.out.println("after logger method executing...");
    }
}
