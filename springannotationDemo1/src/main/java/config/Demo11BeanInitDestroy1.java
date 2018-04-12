package config;

import factory.ColorFactoryBean;
import model.Car;
import model.Car1;
import model.Car2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  将工厂Bean放到Spring容器中
 *
 * @author: Forever丶诺
 * @date: 2018/4/11 15:13
 */
@Configuration
public class Demo11BeanInitDestroy1 {

    @Bean(initMethod="init",destroyMethod = "destroy")
    public Car car() {
        return new Car().setName("生命周期方式1");
    }


    @Bean
    public Car1 car1(){
        return  new Car1().setName("生命周期方式2");
    }

    @Bean
    public Car2 car2(){
        return new Car2().setName("使用@PostConstruct和@PreDestroy注解");
    }


}
