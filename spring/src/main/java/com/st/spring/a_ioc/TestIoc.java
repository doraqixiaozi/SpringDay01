package com.st.spring.a_ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
    @Test
    public void now(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/st/spring/a_ioc/IocBean.xml");
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("hello spring");
        System.out.println(helloSpring.getInfo());

    }
}
