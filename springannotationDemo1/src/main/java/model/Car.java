package model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 16:59
 */
@Data
@Accessors(chain = true)
public class Car {
    private String name;
    private Integer type;

    public Car() {
        System.out.println("构造函数");
    }

    /**
     * 初始化方法
     */
    public void init() {
        System.out.println("........初始化方法....");
    }

    /**
     * 销毁方法
     */
    public void destroy() {
        System.out.println("...........销毁方法....");
    }

}
