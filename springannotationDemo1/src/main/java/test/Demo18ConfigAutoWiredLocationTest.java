package test;

import config.Demo17AutoWiredLocation;
import config.Demo18ConfigAutoWiredLocation;
import model.AutoWiredLocationA;
import model.AutoWiredLocationB;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 15:14
 */
public class Demo18ConfigAutoWiredLocationTest {

    AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo18ConfigAutoWiredLocation.class);

    @Test
    public void test() {
        AutoWiredLocationA autoWiredLocationA = (AutoWiredLocationA) anContext.getBean("autoWiredLocationA");
        AutoWiredLocationB autoWiredLocationB = autoWiredLocationA.getAutoWiredLocationB();
        System.out.println(autoWiredLocationB);
    }

}
