package test;

import config.Demo14SetValue1;
import model.Blue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 9:55
 */

public class Demo14XmlSetValue1Test {
    ClassPathXmlApplicationContext xmlContent = new ClassPathXmlApplicationContext("spring/Demo14SetValue1.xml");

    @Test
    public void test() {
        Blue blue = (Blue) xmlContent.getBean("blue");
        System.out.println(blue);
    }

}
