package model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 16:59
 */
@Data
@Accessors(chain = true)
public class Car1 implements InitializingBean,DisposableBean {
    private String name;
    private Integer type;

    public Car1() {
        System.out.println("构造函数");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean 的销毁方法" );
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
