package com.st.spring.e_annotation.component;

import org.springframework.stereotype.Component;

@Component("person1")
public class Person {
    public  void sayHello(){
        System.out.println("hello I'm caixunkun!");
    }
}
