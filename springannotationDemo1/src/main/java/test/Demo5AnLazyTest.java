package test;

import config.Demo5Lazy;
import model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 13:17
 */
public class Demo5AnLazyTest {

    ApplicationContext anContext = new AnnotationConfigApplicationContext(Demo5Lazy.class);


    /**
     * 单例模式:
     * 懒加载 false
     * <p>
     * 放入容器的时候就创建对象
     */
    @Test
    public void testXmlScopeSingletonLazyFalse() {
        Person person1 = (Person) anContext.getBean("personSingletonLazyFalse");
        Person person2 = (Person) anContext.getBean("personSingletonLazyFalse");
        System.out.println(person1 == person2);
    }

    /**
     * 单例模式:
     * 懒加载 false
     * <p>
     * 放入容器的时候就创建对象
     */
    @Test
    public void testAnScopeSingletonLazyDefault() {
        Person person1 = (Person) anContext.getBean("personSingletonLazyDefaultAn");
        Person person2 = (Person) anContext.getBean("personSingletonLazyDefaultAn");
        System.out.println(person1 == person2);
    }

    /**
     * 懒加载GetBean的时候才会初始化对象
     */
    @Test
    public void testAnScopeSingletonLazyTrue() {
        Person person1 = (Person) anContext.getBean("personSingletonLazyTrue");
        Person person2 = (Person) anContext.getBean("personSingletonLazyTrue");
        System.out.println(person1 == person2);
    }

    /**
     * 懒加载GetBean的时候才会初始化对象
     */
    @Test
    public void testPersonPrototypeLazyFalseAn() {
        Person person1 = (Person) anContext.getBean("personPrototypeLazyFalseAn");
        Person person2 = (Person) anContext.getBean("personPrototypeLazyFalseAn");
        System.out.println(person1 == person2);
    }


}
