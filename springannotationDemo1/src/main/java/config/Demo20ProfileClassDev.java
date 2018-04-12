package config;

import model.Blue;
import model.Green;
import model.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 15:12
 */
@Configuration
@Profile("dev")
public class Demo20ProfileClassDev {



    @Bean
    public Red red() {
        return new Red();
    }


    @Bean
    public Blue blue() {
        return new Blue();
    }

    @Bean
    public Green green() {
        return new Green();
    }

}
