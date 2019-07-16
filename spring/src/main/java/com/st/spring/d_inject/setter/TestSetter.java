package com.st.spring.d_inject.setter;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetter {
    @Test
    public void  test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/st/spring/d_inject/beans.xml");
        Person person = (Person) applicationContext.getBean("person1");
        System.out.println(person);
    }
}
