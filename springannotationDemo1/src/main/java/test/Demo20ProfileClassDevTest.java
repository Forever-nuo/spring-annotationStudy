package test;

import config.Demo20ProfileClassDev;
import config.Demo20ProfileClassTest;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 15:38
 */
public class Demo20ProfileClassDevTest {

    @Test
    public void testDev() {
        AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext();
        anContext.getEnvironment().setActiveProfiles("dev");
        anContext.register(Demo20ProfileClassDev.class);
        anContext.refresh();
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void testTest() {
        AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext();
        anContext.getEnvironment().setActiveProfiles("test");
        anContext.register(Demo20ProfileClassTest.class);
        anContext.refresh();
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
