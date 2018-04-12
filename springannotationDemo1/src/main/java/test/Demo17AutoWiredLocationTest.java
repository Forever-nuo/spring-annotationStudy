package test;

import config.Demo16Resource;
import config.Demo17AutoWiredLocation;
import model.AutoWiredLocationA;
import model.AutoWiredLocationB;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 15:05
 */
public class Demo17AutoWiredLocationTest {

    AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo17AutoWiredLocation.class);

    @Test
    public void test() {
        AutoWiredLocationA autoWiredLocationA = anContext.getBean(AutoWiredLocationA.class);
        AutoWiredLocationB autoWiredLocationB = autoWiredLocationA.getAutoWiredLocationB();
        System.out.println(autoWiredLocationB);
    }
}
