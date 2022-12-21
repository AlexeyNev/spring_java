package aop.aspects;

import aop.Book2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect2 {
    @Before("aop.aspects.MyPointcuts2.allAddMethods2()")
    public void beforeAddLoggingAdvice2(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());


        if (methodSignature.getName().equals("addBook")) {
            Object[] arg = joinPoint.getArgs();
            for (Object obj : arg) {
                if (obj instanceof Book2) {
                    Book2 myBook2 = (Book2) obj;
                    System.out.println("Информация о книге: название книги -  "
                            + myBook2.getName() + ", автор - " + myBook2.getAuthor()
                            + ", год издания - " + myBook2.getYearOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("книгу в библиотеку добавляет " + obj);
                }
            }


        }



        System.out.println("beforeAddLoggingAdvice2: логирование попытки получить книгу/журнал");
        System.out.println("----------------------------------");
    }

















//    @Pointcut("execution(* aop.UniLibrary2.*(..))")
//    private void allMethodsFromUniLibrary2() {
//
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary2.returnMagazine())")
//    private void returnMagazineFromUniLibrary2() {
//
//    }
//
//    @Pointcut("allMethodsFromUniLibrary2() && !returnMagazineFromUniLibrary2()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary2() {
//        System.out.println();
//    }
//
//
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary2()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice2() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log 10");
//    }


















//    @Pointcut("execution(* aop.UniLibrary2.get*())")
//    private void allGetMethodsFromUniLibrary2() {
//
//    }

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





}
