package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test11 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig2.class);

        Library2 library2 = context.getBean("library2Bean", Library2.class);
        library2.getBook();



        context.close();
    }
}
