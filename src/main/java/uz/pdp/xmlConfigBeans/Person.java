package uz.pdp.xmlConfigBeans;

import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Setter
public class Person {

    private String fullName;

    private String age;

    private List<String> neckName = new ArrayList<>();

    private Map<String,String> neckNameMap = new HashMap<>();

    public void setNeckNameMap(Map<String, String> neckNameMap) {
        this.neckNameMap = neckNameMap;
    }

    public void setNeckName(List<String> neckName) {
        this.neckName = neckName;
    }

    public Person(String fullName, String age) {
        this.fullName = fullName;
        this.age = age;
    }

    private Person() {

    }

    public static Person getInstance() {
        System.out.println("instance factory-method");
        return new Person();
    }

    public static Person init() {
        System.out.println("init ishlaydi birinchi ");
        return new Person();
    }

    public static Person destroy() {
        System.out.println("dastur tugagandan kiyin destroy method ishlaydi");
        return new Person();
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                ", neckName=" + neckName +
                ", neckNameMap=" + neckNameMap +
                '}';
    }
}

