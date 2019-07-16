package com.st.spring.e_annotation.component.controller;

import com.st.spring.e_annotation.component.service.IAnnotationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class annotationController {

    @Autowired
    private IAnnotationService iAnnotationService;

    @Test
    public void addUser(){
        System.out.println("准备开始添加用户......");
        iAnnotationService.addUser();
    }
}
