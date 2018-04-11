package test;

import config.Demo8ImportSelector;
import config.Demo9ImportBeanDefinitionRegistrar;
import model.Apple;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 15:17
 */
public class Demo9ImportBeanDefinitionRegistrarTest {
    ApplicationContext anContext = new AnnotationConfigApplicationContext(Demo9ImportBeanDefinitionRegistrar.class);


    @Test
    public void test() {
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Apple apple = (Apple) anContext.getBean("apple");
        System.out.println(apple);
    }

}
