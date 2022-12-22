package aop.aspects;

import aop.Student2;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect2 {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: " +
//                "логируем получение списка студентов перед методом getStudents");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students2")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student2> students2) {
//        Student2 firstStudent2 = students2.get(0);
//
//        String nameSurname = firstStudent2.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent2.setNameSurname(nameSurname); //изменили имя студента который идет под номером 0 в листе.
//
//        double avgGrade = firstStudent2.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent2.setAvgGrade(avgGrade); //изменили среднюю оценку студента.
//
//        int cours = firstStudent2.getCourse();
//        cours = cours + 1;
//        firstStudent2.setCourse(cours); //изменили курс студента.
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: " +
//                "логируем получение списка студентов после работы метода getStudents");

        @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
        public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
            System.out.println("afterThrowingGetStudentsLoggingAdvice: " +
                    "логируем выброс исключения " + exception);
    }
}
