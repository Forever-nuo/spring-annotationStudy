package test;

import config.Demo7Import2;
import config.Demo8ImportSelector;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 15:17
 */
public class Demo8ImportSelectorTest {
    ApplicationContext anContext = new AnnotationConfigApplicationContext(Demo8ImportSelector.class);


    @Test
    public void test() {
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
