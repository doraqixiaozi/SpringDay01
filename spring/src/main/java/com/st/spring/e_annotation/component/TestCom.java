package com.st.spring.e_annotation.component;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCom {
    @Test
    public void testCom(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/st/spring/e_annotation/annotationBean.xml");
        Person person = (Person) applicationContext.getBean("person1");
        person.sayHello();
    }
}
