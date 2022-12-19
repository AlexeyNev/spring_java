package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test11 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig2.class);

        UniLibrary2 uniLibrary2 = context.getBean("uniLibrary2", UniLibrary2.class);

        uniLibrary2.getBook();
        uniLibrary2.getMagazine();




//        uniLibrary2.returnBook();
//        SchoolLibrary2 schoolLibrary2 = context.getBean("schoolLibrary2", SchoolLibrary2.class);
//        schoolLibrary2.getBook();


        context.close();
    }
}
