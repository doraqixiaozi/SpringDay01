package com.st.spring.c_lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {

    @Test
    public  void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/st/spring/c_lifecycle/LifecycleBean.xml");
        HelloSpring helloSpring =(HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(helloSpring.getInfo());
        helloSpring.initBean();
        helloSpring.destroyBean();
    }
}
