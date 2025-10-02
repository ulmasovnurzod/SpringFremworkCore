package uz.pdp.autoConfigBeans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;

import org.springframework.stereotype.Component;

@Data
@Component
public class Student {

    public void hi() {
        System.out.println("hello PDP ! ");
        System.out.println("autoconfig");
    }

    @PostConstruct
    public void init() {
        System.out.println(getClass().getName()+ " init method");

    }

    @PreDestroy
    public void destroy() {
        System.out.println(getClass().getName() + " destroy method");
    }

}
