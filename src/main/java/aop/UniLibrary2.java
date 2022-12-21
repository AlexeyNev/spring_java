package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary2 extends AbstractLibrary2 {

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary2: ");
        System.out.println("----------------------------------");
    }


    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary2 ");
        System.out.println("----------------------------------");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary2: ");
        System.out.println("----------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary2 ");
        System.out.println("----------------------------------");
    }

    public void addBook(String peron_name, Book2 book2) {
        System.out.println("Мы добавляем книгу в UniLibrary2: ");
        System.out.println("----------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary2: ");
        System.out.println("----------------------------------");
    }
}
