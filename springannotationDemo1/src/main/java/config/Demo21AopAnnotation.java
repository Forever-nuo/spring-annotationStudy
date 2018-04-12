package config;

import aop.LogAspect;
import aop.TargetObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 16:02
 */
@EnableAspectJAutoProxy
@Configuration
public class Demo21AopAnnotation {

    /**
     * 将目标类放入到spring容器中
     */
    @Bean
    public TargetObject targetObject() {
        return new TargetObject();
    }

    /**
     * 将切面类放入到Spring容器中
     *
     * @return
     */
    @Bean
    public LogAspect logAspect() {
        return new LogAspect();
    }

}

