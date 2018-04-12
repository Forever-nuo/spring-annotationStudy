package test;

import config.Demo21AopAnnotation;
import config.Demo22TxAnnotation;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import tx.TxService;

import javax.sql.DataSource;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 16:32
 */
public class Demo22TxAnnotationTest {
    AnnotationConfigApplicationContext anContext = new AnnotationConfigApplicationContext(Demo22TxAnnotation.class);

    @Test
    public void test() {

        String[] beanDefinitionNames = anContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        TxService txService =  anContext.getBean(TxService.class);
        txService.insertPerson();
    }

}
