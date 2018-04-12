package test;

import config.Demo13ApplicationContextAware;
import model.Red;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 9:32
 */
@Configuration
public class Demo13ApplicationContextAwareTest {

    AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo13ApplicationContextAware.class);

    @Test
    public void test() {
        Red red = (Red) anContext.getBean("red");
        ApplicationContext context = red.getContext();
        System.out.println(context);
    }

}
