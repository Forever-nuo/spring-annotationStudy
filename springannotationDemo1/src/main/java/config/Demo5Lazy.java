package config;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 13:35
 */
@Configuration
public class Demo5Lazy {

    /**
     * 单例的默认 true
     * 是懒加载
     *
     * @return
     */
    @Lazy
    @Bean
   public Person personSingletonLazyDefaultAn() {
        return new Person().setName("注解单例");
    }

    /**
     * 多列的
     *
     * @return
     */
    @Lazy(false)
    @Bean
    public Person personPrototypeLazyFalseAn() {
        return new Person().setName("注解单例 不懒加载");
    }

}
