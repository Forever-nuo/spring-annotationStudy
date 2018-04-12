package test;

import aop.TargetObject;
import config.Demo16Resource;
import config.Demo21AopAnnotation;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 16:05
 */
public class Demo21AopAnnotationTest {

    AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo21AopAnnotation.class);

    @Test
    public void test() {
        //获取目标了
        TargetObject targetObject = anContext.getBean(TargetObject.class);
        targetObject.method1();

    }

}
