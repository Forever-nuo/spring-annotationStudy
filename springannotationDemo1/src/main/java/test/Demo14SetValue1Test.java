package test;

import config.Demo14SetValue1;
import model.Blue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 9:55
 */

public class Demo14SetValue1Test {
    AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo14SetValue1.class);

    @Test
    public void test() {
        Blue blue = (Blue) anContext.getBean("blue");
        ConfigurableEnvironment environment = anContext.getEnvironment();
        Map<String, Object> systemProperties = environment.getSystemProperties();
        String first = environment.getProperty("first");
        System.out.println(first);
        System.out.println(blue);
    }

}
