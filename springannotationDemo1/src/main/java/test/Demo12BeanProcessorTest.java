package test;

import config.Demo11BeanInitDestroy1;
import config.Demo12BeanProcessor;
import model.Car;
import model.Car2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import other.FirstBeanPostProcessor;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 9:05
 */

public class Demo12BeanProcessorTest {

    AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo12BeanProcessor.class);

    @Test
    public void test() {
        Car2 car2 = (Car2) anContext.getBean("car2");
        System.out.println(car2);
    }
}
