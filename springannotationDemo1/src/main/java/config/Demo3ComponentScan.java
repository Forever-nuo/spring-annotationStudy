package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 注解扫描@ComponentScan的使用
 *
 * @author: Forever丶诺
 * @date: 2018/4/11 10:11
 * <p>
 * 扫描单个包及子包:@ComponentScan("包名") @ComponentScan("service")
 * 扫描多个包
 * 方式1:@ComponentScan({"包1,包2"})
 * 方式2:@ComponentScan(basePackages = {"包1","包2"})
 */
@ComponentScan({"service", "controller"})
@Configuration
public class Demo3ComponentScan {

}
