package config;

import model.Apple;
import model.Pear;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * 注解@import Bean的class形式
 * 导入其他配置类文件
 * Demo2Bean类
 * 会将其他的配置类中的Bean放在一起
 * @author: Forever丶诺
 * @date: 2018/4/11 15:13
 */
@Configuration
@Import({Demo2Bean.class})
public class Demo7Import2 {
}
