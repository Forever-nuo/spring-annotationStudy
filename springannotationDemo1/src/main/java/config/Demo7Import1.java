package config;

import model.Apple;
import model.Pear;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 注解@import Bean的class形式
 * 放到spring容器中  id 是Bean 的全类名
 * Bean普通Bean就行 不需要添加注解
 * @author: Forever丶诺
 * @date: 2018/4/11 15:13
 */
@Configuration
@Import({Apple.class, Pear.class})
public class Demo7Import1 {
}
