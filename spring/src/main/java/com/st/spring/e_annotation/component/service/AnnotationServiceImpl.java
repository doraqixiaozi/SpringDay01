package com.st.spring.e_annotation.component.service;

import com.st.spring.e_annotation.component.dao.AnnotationDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnnotationServiceImpl implements IAnnotationService {
    @Autowired
    @Qualifier("annotationDao")
    private AnnotationDao annotationDao;

    @Test
    public void addUser() {
        System.out.println("开始添加用户!");
        annotationDao.addUser();
    }
}
