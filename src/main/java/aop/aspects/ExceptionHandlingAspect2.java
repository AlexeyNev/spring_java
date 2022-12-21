package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect2 {
    @Before("aop.aspects.MyPointcuts2.allAddMethods2()")
    public void beforeAddExceptionHandlingAdvice2() {
        System.out.println("beforeAddExceptionHandlingAdvice2: " +
                "ловим/обрабатываем исключение при попытке получить книгу или журнал");
        System.out.println("----------------------------------");
    }
}
