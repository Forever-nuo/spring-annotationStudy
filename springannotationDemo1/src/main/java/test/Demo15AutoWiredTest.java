package test;

import config.Demo14SetValue1;
import config.Demo15AutoWired;
import controller.PersonController;
import model.Fruit;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 13:20
 */
public class Demo15AutoWiredTest {

    AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo15AutoWired.class);




    @Test
    public void test() {
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        PersonController personController = anContext.getBean(PersonController.class);
        personController.sayService();
        Fruit fruit = personController.getFruit();
        System.out.println(fruit);

        Fruit pear = personController.getPear();
        System.out.println(pear);
    }

}
