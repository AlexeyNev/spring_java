package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect2 {
    @Before("aop.aspects.MyPointcuts2.allGetMethods2()")
    public void beforeGetExceptionHandlingAdvice2() {
        System.out.println("beforeGetExceptionHandlingAdvice: " +
                "ловим/обрабатываем исключение при попытке получить книгу или журнал");
    }
}
