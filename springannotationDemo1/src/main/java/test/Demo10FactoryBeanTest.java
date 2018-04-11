package test;

import config.Demo10FactoryBean;
import config.Demo7Import2;
import factory.Color;
import factory.ColorFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.springframework.beans.factory.BeanFactory.FACTORY_BEAN_PREFIX;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 15:17
 */
public class Demo10FactoryBeanTest {
    ApplicationContext anContext = new AnnotationConfigApplicationContext(Demo10FactoryBean.class);

    /**
     * 获取FactoryBean创建的对象
     *
     * @Author: Forever丶诺
     * @Date: 2018/4/11 16:45
     */
    @Test
    public void testGetFactoryBean() {
        String[] names = anContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Color color = (Color) anContext.getBean("color");
        System.out.println(color.getName());
    }

    /**
     * 获得工厂对象本身
     * BeanFactory.FACTORY_BEAN_PREFIX
     * @Author: Forever丶诺
     * @Date: 2018/4/11 16:48
     */
    @Test
    public void testGetFactoryOneSelf() {
        //BeanFactory
        ColorFactoryBean colorFactory = (ColorFactoryBean) anContext.getBean(FACTORY_BEAN_PREFIX + "color");
        boolean singleton = colorFactory.isSingleton();
        System.out.println(singleton);
    }

}
