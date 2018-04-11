package test;

import config.Demo6Conditional;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 14:26
 */

public class Demo6ConditionalTest {
    ApplicationContext anContext = new AnnotationConfigApplicationContext(Demo6Conditional.class);

    @Test
    public void test() {
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }

}
