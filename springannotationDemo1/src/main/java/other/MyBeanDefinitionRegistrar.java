package other;

import model.Apple;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Bean注册类 实现ImportBeanDefinitionRegistrar接口
 *
 * @author: Forever丶诺
 * @date: 2018/4/11 16:01
 */
public class MyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClassName(Apple.class.getName());
        //注入Bean
        registry.registerBeanDefinition("apple",beanDefinition);
        System.out.println(111);
    }
}
