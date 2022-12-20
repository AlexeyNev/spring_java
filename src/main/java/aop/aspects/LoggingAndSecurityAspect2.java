package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect2 {

    @Pointcut("execution(* aop.UniLibrary2.*(..))")
    private void allMethodsFromUniLibrary2() {

    }

    @Pointcut("execution(public void aop.UniLibrary2.returnMagazine())")
    private void returnMagazineFromUniLibrary2() {

    }

    @Pointcut("allMethodsFromUniLibrary2() && !returnMagazineFromUniLibrary2()")
    private void allMethodsExceptReturnMagazineFromUniLibrary2() {
        System.out.println();
    }



    @Before("allMethodsExceptReturnMagazineFromUniLibrary2()")
    public void beforeAllMethodsExceptReturnMagazineAdvice2() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log 10");
    }


















//    @Pointcut("execution(* aop.UniLibrary2.get*())")
//    private void allGetMethodsFromUniLibrary2() {
//
//    }
//
//    @Pointcut("execution(* aop.UniLibrary2.return*())")
//    private void allReturnMethodsFromUniLibrary2() {
//
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary2() || allReturnMethodsFromUniLibrary2()")
//    private void allGetAndReturnMethodsFromUniLibrary2() {
//        System.out.println();
//    }
//
//
//    @Before("allGetMethodsFromUniLibrary2()")
//    public void beforeGetLoggingAdvice2() {
//        System.out.println("beforeGetLoggingAdvice2: writing Log 1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary2()")
//    public void beforeReturnLoggingAdvice2() {
//        System.out.println("beforeReturnLoggingAdvice2: writing Log 2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary2()")
//    public void beforeGetAndReturnLoggingAdvice2() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log 3");
//    }





//    @Pointcut("execution(* get*())")
//    private void allGetMethods2() {
//
//    }
//
//
//    @Before("allGetMethods2()")
//    public void beforeGetBookAdvice2() {
//        System.out.println("beforeGetBookAdvice2: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods2()")
//    public void beforeGetSecurityAdvice2() {
//        System.out.println("beforeGetSecurityAdvice2: проверка прав на получение книги/журнала");
//    }
}
