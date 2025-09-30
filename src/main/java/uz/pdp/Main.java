package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.pdp.autoConfigBeans.Student;
import uz.pdp.autoConfigBeans.Student2;
import uz.pdp.configurations.ScanConfig;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScanConfig.class);
        Student2 studentBean2 = context.getBean(Student2.class);
        studentBean2.hi();
    }
}