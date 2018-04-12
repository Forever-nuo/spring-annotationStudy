package test;

import config.Demo1Configuration;
import model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 9:42
 */
public class Demo1ConfigurationTest {

    /**
     * 测试 xml文件创建Spring容器
     *
     * @param :
     * @Author: Forever丶诺
     * @Date: 2018/4/11 9:00
     */
    @Test
    public void testSpringXml() {
        String xmlPath = "spring/demo1Configuration.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(context);
    }

    /**
     * 从Configuration注解创建Spring容器
     */
    @Test
    public void testSpringConfiguration() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Demo1Configuration.class);
        System.out.println(context);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }


}
