package config;

import factory.ColorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *  将工厂Bean放到Spring容器中
 *
 * @author: Forever丶诺
 * @date: 2018/4/11 15:13
 */
@Configuration
public class Demo10FactoryBean {

    @Bean
    public ColorFactoryBean color() {
        return new ColorFactoryBean();
    }

}
