package uz.pdp.autoConfigBeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HomeController {

    private final Service service;

    public HomeController(@Qualifier("userService2") Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "HomeController{" +
                "service=" + service +
                '}';
    }
}
