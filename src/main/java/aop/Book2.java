package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book2 {
    @Value("Преступление и наказание")
    private String name;

    public String getName() {
        return name;
    }
}
