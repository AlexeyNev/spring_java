package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect2 {

    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice2() {
        System.out.println("beforeGetBookAdvice2: попытка получить книгу");
    }
}
