package config;

import model.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 9:32
 */
@Configuration
public class Demo13ApplicationContextAware {
    
    @Bean
    public Red red() {
        return new Red().setName("红色的");
    }

}
