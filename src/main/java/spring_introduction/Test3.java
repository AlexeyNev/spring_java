package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Dog();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext");

        Pet pet = context.getBean("myPet", Pet.class);

        Person person = new Person(pet);
        person.callYouPet();
        context.close();
    }
}
