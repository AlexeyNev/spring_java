package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect2 {

    @Pointcut("execution(* get*())")
    private void allGetMethods2() {

    }


    @Before("allGetMethods2()")
    public void beforeGetBookAdvice2() {
        System.out.println("beforeGetBookAdvice2: попытка получить книгу/журнал");
    }

    @Before("allGetMethods2()")
    public void beforeGetSecurityAdvice2() {
        System.out.println("beforeGetSecurityAdvice2: проверка прав на получение книги/журнала");
    }
}
