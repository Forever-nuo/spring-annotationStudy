package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import other.FirstImportSelector;
import other.MyBeanDefinitionRegistrar;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 15:51
 */

@Configuration
@Import({MyBeanDefinitionRegistrar.class})
public class Demo9ImportBeanDefinitionRegistrar {
}
