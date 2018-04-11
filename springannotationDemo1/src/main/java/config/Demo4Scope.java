package config;

import model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 13:35
 */
@Configuration
public class Demo4Scope {

    /**
     * 默认是单例的
     *
     * @return
     */
    @Scope
    @Bean
    Person personSingleton() {
        return new Person().setName("注解单例");
    }

    /**
     * 多列的
     *
     * @return
     */
    @Scope(SCOPE_PROTOTYPE)
    @Bean
    Person personPrototype() {
        return new Person().setName("注解多例");
    }

}
