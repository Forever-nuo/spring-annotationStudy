package test;

import config.Demo2Bean;
import model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 8:58
 */
public class Demo2BeanTest {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring/demo2Bean.xml");

    /**
     * 测试Spring的xml文件
     * 没有id 的Bean
     *
     * @param :
     * @Author: Forever丶诺
     * @Date: 2018/4/11 9:00
     */
    @Test
    public void testSpringXmlNoIdBean() {
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        Person person = (Person) context.getBean("model.Person#0");
        System.out.println(person);
    }

    /**
     * 测试Spring的xml文件
     * 有id 的Bean
     *
     * @param :
     * @Author: Forever丶诺
     * @Date: 2018/4/11 9:00
     */
    @Test
    public void testSpringXmlHasIdBean() {
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }

    /**
     * 从spring的配置对象中 创建Spring容器
     *
     * @param :
     * @Author: Forever丶诺
     * @Date: 2018/4/11 9:21
     */
    @Test
    public void testSpringConfiguration() {
        //根据配置文件获得Spring容器上下文对象  参数是使用了@Configuration注解的类
        ApplicationContext context = new AnnotationConfigApplicationContext(Demo2Bean.class);
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }

    /**
     * 测试有@Bean 有name属性值
     */
    @Test
    public void testBeanHasName() {
        //根据配置文件获得Spring容器上下文对象
        ApplicationContext context = new AnnotationConfigApplicationContext(Demo2Bean.class);
        Person person = (Person) context.getBean("person1");
        System.out.println(person);
    }

}
