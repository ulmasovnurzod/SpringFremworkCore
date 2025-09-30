package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.configurations.JavaConfig;
import uz.pdp.javaConfigBeans.User;
import uz.pdp.javaConfigBeans.User2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        User2 userBean2 = context.getBean(User2.class);
        userBean2.hi();
    }
}