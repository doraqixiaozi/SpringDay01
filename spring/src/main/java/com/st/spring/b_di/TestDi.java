package com.st.spring.b_di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDi {
    @Test
    public void now(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/st/spring/b_di/DiBean.xml");
        HelloSpring helloSpring =(HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(helloSpring.helloDi());
    }

    public  void before(){
        HelloSpring helloSpring = new HelloSpring();
        DiSpring diSpring = new DiSpring();
        helloSpring.setInfo(diSpring);
        System.out.println(helloSpring.helloDi());
    }
}
