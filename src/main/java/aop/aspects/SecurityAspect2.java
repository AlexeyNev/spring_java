package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect2 {
    @Before("aop.aspects.MyPointcuts2.allGetMethods2()")
    public void beforeGetSecurityAdvice2() {
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
    }
}
