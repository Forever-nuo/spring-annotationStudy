package test;

import config.Demo15AutoWired;
import config.Demo16Resource;
import controller.PersonController;
import controller.PersonController2;
import model.Fruit;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PersonService2;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 13:20
 */
public class Demo16ResourceTest {

    AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo16Resource.class);




    @Test
    public void test() {
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        PersonController2 personController = anContext.getBean(PersonController2.class);
        PersonService2 personService2 = personController.getPersonService2();
        PersonService2 personService4 = personController.getPersonService4();
        PersonService2 personService5 = personController.getPersonService5();
        System.out.println(personService2);
    }

}
