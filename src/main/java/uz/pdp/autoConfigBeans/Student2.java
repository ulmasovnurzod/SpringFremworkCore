package uz.pdp.autoConfigBeans;

import org.springframework.stereotype.Component;

@Component
public class Student2 {

    private final Student student;

    public Student2(Student student) {
        this.student = student;
    }

    public void hi(){
        System.out.println("Student2)");
        student.hi();
    }
}
