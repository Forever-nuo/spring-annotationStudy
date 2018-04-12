package config;

import model.Car2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import other.FirstBeanPostProcessor;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 9:05
 */
@Configuration
@Import(FirstBeanPostProcessor.class)
public class Demo12BeanProcessor {

    @Bean
    public Car2 car2() {
        return new Car2().setName("注解初始化");
    }

}
