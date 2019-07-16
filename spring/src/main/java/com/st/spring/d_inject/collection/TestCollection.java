package com.st.spring.d_inject.collection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
    @Test
    public void testCollection(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("com/st/spring/d_inject/beans.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println("list:"+collectionBean.getList());
        System.out.println("数组:"+collectionBean.getArray());
        System.out.println("set:"+collectionBean.getSet());
        System.out.println("map:"+collectionBean.getMap());
    }

}
