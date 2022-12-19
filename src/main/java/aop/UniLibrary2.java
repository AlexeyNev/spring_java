package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary2 extends AbstractLibrary2 {

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary2: ");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary2 ");
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary2: ");
    }
}
