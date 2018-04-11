package config;

import model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 9:16
 */
@Configuration
public class Demo2Bean {

    /**
     * 默认的@Bean注解
     * id是方法名
     *
     * @Author: Forever丶诺
     * @Date: 2018/4/11 9:23
     */
    @Bean
    Person person() {
        return new Person().setName("张三2").setAge(12);
    }

    /**
     * 使用name为id赋指定的值
     *
     * @return
     */
    @Bean(name = "person1")
    Person person1() {
        return new Person().setName("张三1").setAge(11);
    }

}
