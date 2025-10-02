package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.pdp.configurations.JavaConfig;
import uz.pdp.javaConfigBeans.User;
import uz.pdp.javaConfigBeans.User2;
import uz.pdp.xmlConfigBeans.MyBean;
import uz.pdp.xmlConfigBeans.MyBean2;
import uz.pdp.xmlConfigBeans.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//        User2 userBean2 = context.getBean(User2.class);
//        userBean2.hi();

        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("ioc-settings.xml");
//        MyBean2 bean2 = container.getBean(MyBean2.class);
//        bean2.hi();

        container.getBean(MyBean2.class).hi();
        System.out.println(container.getBean(Person.class));



    }
}