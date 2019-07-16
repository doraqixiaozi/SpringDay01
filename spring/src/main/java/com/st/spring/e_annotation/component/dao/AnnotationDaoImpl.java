package com.st.spring.e_annotation.component.dao;

import com.st.spring.e_annotation.component.Person;
import org.springframework.stereotype.Repository;

@Repository("annotationDao")
public class AnnotationDaoImpl implements AnnotationDao{

    public void addUser(Person person) {
        System.out.println("添加用户成功!");
    }
}
