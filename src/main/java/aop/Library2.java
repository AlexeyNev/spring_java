package aop;

import org.springframework.stereotype.Component;

@Component("library2Bean")
public class Library2 {
    public void getBook() {
        System.out.println("Мы берем книгу");
    }
}
