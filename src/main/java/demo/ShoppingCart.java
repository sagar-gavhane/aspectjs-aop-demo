package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status) {
        System.out.println("checkout method executing... status is "+status);
    }
}
