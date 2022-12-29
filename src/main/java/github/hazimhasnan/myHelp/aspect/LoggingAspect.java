package github.hazimhasnan.myHelp.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

/*
    Aspect: the class that defines the pointcuts and advices

    joinPoint: the exact method/location aspect is applied

    pointcut: expression to tell which method or location or jointpoint the advice should be applied
    advice: the exact method/logic to run as the advice

    advice annotations:
        1) before
        2) after
        3) around
        4) etc

    pointcut designators:
        within: matches the type (class or subpackage)
        execution: matches the method (method signature)

    link: https://reflectoring.io/aop-spring/
            https://www.baeldung.com/spring-aop-pointcut-tutorial
 */

    @Pointcut("within(myhelp.*.*)")
    public void logAll(){}
    
    @Before("execution(* github.hazimhasnan.myHelp.MyHelpApplication.main(..))")
    public void logMyMethods () {
        log.info("Executing before my methods");
    }
    @After("logAll()")
    public void logExecutionTime () {
        log.info("---> Execution time is 5s ish");
    }
}
