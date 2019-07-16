package com.st.spring.d_inject.constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCons {
   @Test
    public void  testCons() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/st/spring/d_inject/beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
