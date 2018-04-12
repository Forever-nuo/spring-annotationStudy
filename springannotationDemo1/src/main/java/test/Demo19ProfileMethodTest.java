package test;

import config.Demo18ConfigAutoWiredLocation;
import config.Demo19ProfileMethod;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 15:30
 */
public class Demo19ProfileMethodTest {

    /**
     * 设置启动Profile
     */
    @Test
    public void testSetProfiles() {
        AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext();
        anContext.getEnvironment().setActiveProfiles("test","dev");
        anContext.register(Demo19ProfileMethod.class);
        anContext.refresh();
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * 默认的ProfileDefault
     */
    @Test
    public void testDefaultProfiles() {
        AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo19ProfileMethod.class);
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
