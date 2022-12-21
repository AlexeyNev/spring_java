package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect2 {
    @Before("aop.aspects.MyPointcuts2.allAddMethods2()")
    public void beforeAddSecurityAdvice2() {
        System.out.println("beforeAddSecurityAdvice2: проверка прав на получение книги/журнала");
        System.out.println("----------------------------------");
    }
}
