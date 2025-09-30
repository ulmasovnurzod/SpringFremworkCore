package uz.pdp.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uz.pdp.autoConfigBeans.Student;
import uz.pdp.javaConfigBeans.User;
import uz.pdp.javaConfigBeans.User2;

@Configuration
public class JavaConfig {


    @Bean
    public User user() {
        return new User();
    }

    @Bean
    public User2 user2(User user) {
        return new User2(user);
    }
}
