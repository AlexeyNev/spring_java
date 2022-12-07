package spring_introduction;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callYouPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }
}
