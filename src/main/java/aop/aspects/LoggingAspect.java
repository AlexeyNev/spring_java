package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Сигнатура нашего метода: " + methodSignature);
        System.out.println("Метод нашего метода: " + methodSignature.getMethod());
        System.out.println("Возвращаемое значение нашего метода: " + methodSignature.getReturnType());
        System.out.println("Имя нашего метода: " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] argument = joinPoint.getArgs();
            for (Object obj : argument) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println(
                            "Информация о книге: " + myBook.getName() +
                            " автор: " + myBook.getAuthor() +
                            " дата издания: " + myBook.getYearOfPublication());
                }
                else if (obj instanceof String) {
                    System.out.println("книгу в библиотеку добавляет " + obj);
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: " +
                "логирование попытки получить книгу или журнал");
        System.out.println("-----------------------------------");
    }

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//        private void allMethodsFromUniLibrary() {
//
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//
//    }
//
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//
//    }
//
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }














//    @Pointcut("execution(* aop.UniLibrary.get*())")
//        private void allGetMethodsFromUniLibrary() {
//
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//        private void allReturnMethodsFromUniLibrary() {
//
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//        private void allGetAndReturnMethodsFromUniLibrary() {
//
//    }



//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//    }








}
