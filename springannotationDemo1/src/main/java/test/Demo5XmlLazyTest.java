package test;

import model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 13:17
 */
public class Demo5XmlLazyTest {

    ApplicationContext xmlContext = new ClassPathXmlApplicationContext("spring/demo5Lazy.xml");


    /**
     * 单例模式:
     * 懒加载 false
     * <p>
     * 放入容器的时候就创建对象
     */
    @Test
    public void testXmlScopeSingletonLazyFalse() {
        Person person1 = (Person) xmlContext.getBean("personSingletonLazyFalse");
        Person person2 = (Person) xmlContext.getBean("personSingletonLazyFalse");
        System.out.println(person1 == person2);
    }

    /**
     * 单例模式:
     * 懒加载 false
     * <p>
     * 放入容器的时候就创建对象
     */
    @Test
    public void testXmlScopeSingletonLazyDefault() {
        Person person1 = (Person) xmlContext.getBean("personSingletonLazyDefault");
        Person person2 = (Person) xmlContext.getBean("personSingletonLazyDefault");
        System.out.println(person1 == person2);
    }

    /**
     * 懒加载GetBean的时候才会初始化对象
     */
    @Test
    public void testXmlScopeSingletonLazyTrue() {
        Person person1 = (Person) xmlContext.getBean("personSingletonLazyTrue");
        Person person2 = (Person) xmlContext.getBean("personSingletonLazyTrue");
        System.out.println(person1 == person2);
    }


}
