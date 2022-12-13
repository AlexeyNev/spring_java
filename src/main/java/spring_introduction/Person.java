package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Аннотация @Qualifier.
 * Используется для того, что бы показать спрингу какой именно использовать бин.
 * Если бинов больше одного.
 *
 * Аннотация @Value.
 * Для внедрения строк и других значений можно использовать аннотация @Value.
 * В этом случае в сеттерах нет необходимости, как это было при конфигурации с помощью XML файла.
 */

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("catBean")

    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created");
    }
//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYouPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }
}
