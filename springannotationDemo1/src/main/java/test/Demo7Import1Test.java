package test;

import config.Demo6Conditional;
import config.Demo7Import1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 15:17
 */
public class Demo7Import1Test {
    ApplicationContext anContext = new AnnotationConfigApplicationContext(Demo7Import1.class);


    @Test
    public void test() {
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
