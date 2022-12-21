package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test11 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig2.class);

        UniLibrary2 uniLibrary2 = context.getBean("uniLibrary2", UniLibrary2.class);

        Book2 book2 = context.getBean("book2", Book2.class);

        uniLibrary2.getBook();
        uniLibrary2.addBook("Alexey", book2);
        uniLibrary2.addMagazine();


//        uniLibrary2.returnMagazine();
//        uniLibrary2.addBook();

//        uniLibrary2.returnBook();
//        SchoolLibrary2 schoolLibrary2 = context.getBean("schoolLibrary2", SchoolLibrary2.class);
//        schoolLibrary2.getBook();


        context.close();
    }
}
