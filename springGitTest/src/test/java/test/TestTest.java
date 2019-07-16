package test;

import com.hand.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Test
public class TestTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Person pserson = (Person) context.getBean("person");
    System.out.println(person.toString());
}
