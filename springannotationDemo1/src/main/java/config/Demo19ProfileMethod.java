package config;

import model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 15:12
 */
@Configuration
public class Demo19ProfileMethod {


    @Profile("dev")
    @Bean
    public Red red() {
        return new Red();
    }

    @Profile("test")
    @Bean
    public Blue blue() {
        return new Blue();
    }

    /**
     *默认的default
     */
    @Profile("default")
    @Bean
    public Green green() {
        return new Green();
    }

}
