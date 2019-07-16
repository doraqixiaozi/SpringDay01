package MavenTest.spring.f_collection.list;

import MavenTest.spring.e_setter.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    @Test
    public void now(){
        //1.根据XML配置，生成上下文
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("E:\\IdeaProjects\\MavenTest\\src\\main\\java\\MavenTest\\spring\\f_collection\\list\\application.xml");
        //2.根据bean的ID获取bean
        CollectionBean collection=(CollectionBean) applicationContext.getBean("collection");

        System.out.println("array:"+collection.getArray().toString());
        System.out.println("list:"+collection.getList().toString());
    }
}
