package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University2 {
    private List<Student2> students2 = new ArrayList<>();

    public void addStudents() {
        Student2 st1 = new Student2("Alexey Nevredimov", 3, 4.5);
        Student2 st2 = new Student2("Alla Go", 2, 4.4);
        Student2 st3 = new Student2("Mars", 1, 4.3);

        students2.add(st1);
        students2.add(st2);
        students2.add(st3);
    }

    public List<Student2> getStudents() {
        System.out.println("Начало работы метода getStudents()");

//        System.out.println(students2.get(3));
        System.out.println("Информация о методе getStudents(): ");
        System.out.println(students2);
        return students2;
    }
}
