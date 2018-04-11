package test;

import config.Demo4Scope;
import model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 13:17
 */
public class Demo4ScopeTest {

    ApplicationContext xmlContext = new ClassPathXmlApplicationContext("spring/demo4Scope.xml");
    ApplicationContext annotationContext = new AnnotationConfigApplicationContext(Demo4Scope.class);

    /**
     * 单例模式:
     * 构造函数只初始化一次
     * 对象都是同一个对象
     */
    @Test
    public void testXmlScopeSingleton() {
        Person person1 = (Person) xmlContext.getBean("personSingleton");
        Person person2 = (Person) xmlContext.getBean("personSingleton");
        System.out.println(person1 == person2);
    }

    /**
     * 多例模式
     * 每次从容器中获取对象的时候
     * 都会调用构造函数 初始化新的对象
     */
    @Test
    public void testXmlScopePrototype() {
        Person person1 = (Person) xmlContext.getBean("personPrototype");
        Person person2 = (Person) xmlContext.getBean("personPrototype");
        System.out.println(person1 == person2);
    }

    /**
     * 单例
     *
     */
    @Test
    public void testAnnotationSingleton() {
        Person person1 = (Person) annotationContext.getBean("personSingleton");
        Person person2 = (Person) annotationContext.getBean("personSingleton");
        System.out.println(person1 == person2);
    }

    /**
     * 多例
     */
    @Test
    public void testAnnotationPrototype(){
        Person person1 = (Person) annotationContext.getBean("personPrototype");
        Person person2 = (Person) annotationContext.getBean("personPrototype");
        System.out.println(person1 == person2);
    }

}
