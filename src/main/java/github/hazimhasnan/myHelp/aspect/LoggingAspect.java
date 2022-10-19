package github.hazimhasnan.myHelp.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

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
