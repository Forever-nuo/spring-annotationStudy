package test;

import config.Demo2Bean;
import config.Demo3ComponentScan;
import controller.PersonController;
import model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 8:58
 */
public class Demo3ComponentScanTest {

    /**
     * xml的<context:component-scan></>
     */
    @Test
    public void testXmlComponentScan() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/demo3ComponentScan.xml");
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        PersonController personController = (PersonController) context.getBean("personController");
        personController.testHasService();
    }

    /**
     * 使用注解@componentScan扫描
     */
    @Test
    public void testAnnotationComponentScan() {
        ApplicationContext AnnotationContext = new AnnotationConfigApplicationContext(Demo3ComponentScan.class);
        String[] names = AnnotationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
