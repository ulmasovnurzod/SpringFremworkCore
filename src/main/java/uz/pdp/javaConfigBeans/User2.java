package uz.pdp.javaConfigBeans;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class User2 {

    private final User user;

    public User2(User user) {
        this.user=user;
    }

    public void hi() {
        System.out.println("Hello User!");
        System.out.println("ikkinchi bean user2");
        user.hi();
    }
}
