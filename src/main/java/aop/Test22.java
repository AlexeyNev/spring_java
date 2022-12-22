package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test22 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig2.class);

        University2 university2 = context.getBean("university2", University2.class);
        university2.addStudents();
        try {
            List<Student2> students = university2.getStudents();
            System.out.println(students);
        } catch (Exception e) {
            System.out.println("Было поймано исключение " + e);
        }


        context.close();
    }
}
