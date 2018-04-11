package config;

import condition.MySpringCondition1;
import condition.MySpringCondition2;
import model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 14:26
 */

@Configuration
@Conditional(MySpringCondition2.class)
public class Demo6Conditional {


    @Conditional(MySpringCondition1.class)
    @Bean
    public Person condition1() {
        return new Person().setName("Conditional注解的使用");
    }


    @Conditional(MySpringCondition2.class)
    @Bean
    public Person condition2() {
        return new Person().setName("Conditional注解的使用");
    }

}
