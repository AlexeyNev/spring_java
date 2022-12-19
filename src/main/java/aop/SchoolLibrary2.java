package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary2 extends AbstractLibrary2 {

    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary2 ");
    }
}
