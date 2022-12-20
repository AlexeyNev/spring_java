package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts2 {
    @Pointcut("execution(* get*())")
    public void allGetMethods2() {
    }
}
