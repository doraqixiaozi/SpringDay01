package MavenTest.spring.b_di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    @Test
    public void before(){
        HelloSpring hellospring=new HelloSpring();
        hellospring.setInfo("wuhu");
        System.out.println(hellospring.getInfo());
    }

    @Test
    public void now(){
        //第一步：根据xml配置生成，spring上下文
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\IdeaProjects\\MavenTest\\src\\main\\java\\MavenTest\\spring\\b_di\\application.xml");
        //第二步：根据bean的id获取bean
        HelloSpring helloSpring= (HelloSpring) applicationContext.getBean("helloSpring");
        //第三步：使用
        System.out.println(helloSpring.getDiSpring());
    }
}
