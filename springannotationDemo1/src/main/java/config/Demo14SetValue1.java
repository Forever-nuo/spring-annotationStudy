package config;

import model.Blue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 9:55
 */

@Configuration
@PropertySource("classpath:/jdbc.properties")
public class Demo14SetValue1 {

    @Bean
    public Blue blue(@Value("${jdbc_username}") String name) {
        return new Blue().setName(name);
    }

}
