package config;

import model.AutoWiredLocationA;
import model.AutoWiredLocationB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 15:12
 */
@Configuration
public class Demo18ConfigAutoWiredLocation {

    @Bean
    AutoWiredLocationB autoWiredLocationB() {
        return new AutoWiredLocationB();
    }

    /**
     * 直接调用带@Bean注解的Bean
     * @return
     */
    @Bean
    AutoWiredLocationA autoWiredLocationA() {
        return new AutoWiredLocationA().setAutoWiredLocationB(autoWiredLocationB());
    }

    /**
     * 将Bean作为参数传入
     * @param autoWiredLocationB
     * @return
     */
    @Bean
    AutoWiredLocationA autoWiredLocationA1(AutoWiredLocationB autoWiredLocationB) {
        return new AutoWiredLocationA().setAutoWiredLocationB(autoWiredLocationB);
    }
}
