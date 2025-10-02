package uz.pdp.xmlConfigBeans;

public class MyBean2 {

    private final MyBean myBean;

    public MyBean2(MyBean myBean) {
        this.myBean = myBean;
    }

    public void hi() {
        System.out.println("Hello Nurzod!");
        System.out.println("ioc xmlconfig spring");
        myBean.hi();
    }
}

