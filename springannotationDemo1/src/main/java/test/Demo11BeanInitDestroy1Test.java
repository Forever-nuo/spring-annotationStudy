package test;

import config.Demo10FactoryBean;
import config.Demo11BeanInitDestroy1;
import factory.Color;
import factory.ColorFactoryBean;
import model.Car;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.springframework.beans.factory.BeanFactory.FACTORY_BEAN_PREFIX;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 15:17
 */
public class Demo11BeanInitDestroy1Test {
    AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo11BeanInitDestroy1.class);


    ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("spring/Demo11BeanInitDestroy.xml");
    /**
     * 获取FactoryBean创建的对象
     *
     * @Author: Forever丶诺
     * @Date: 2018/4/11 16:45
     */
    @Test
    public void testInit1() {
        Car car = (Car) anContext.getBean("car");
        System.out.println(car.getName());
        anContext.close();
    }

    @Test
    public void testXmlInit() {
        Car car = (Car) xmlContext.getBean("car");
        System.out.println(car);
        xmlContext.close();
    }



}
