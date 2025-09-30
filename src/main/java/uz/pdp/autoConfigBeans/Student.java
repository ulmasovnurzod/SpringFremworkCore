package uz.pdp.autoConfigBeans;

import lombok.Data;

import org.springframework.stereotype.Component;

@Data
@Component
public class Student {

    public void hi() {
        System.out.println("hello PDP ! ");
        System.out.println("autoconfig");
    }

}
