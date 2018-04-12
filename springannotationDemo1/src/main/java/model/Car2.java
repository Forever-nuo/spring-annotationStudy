package model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 16:59
 */
@Data
@Accessors(chain = true)
public class Car2 {
    private String name;
    private Integer type;

    public Car2() {
        System.out.println("构造函数");
    }


    @PostConstruct
    public void init() {
        System.out.println("使用@postConstruct 注解");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("使用 @PreDestroy 注解");
    }

}
