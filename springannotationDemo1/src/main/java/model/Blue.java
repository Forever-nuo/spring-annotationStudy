package model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 9:47
 */
@Data
@Accessors(chain = true)
@Component
public class Blue {

    /**
     * 使用常量
     */
    @Value("张三")
    private String name;

    /**
     * 使用SPel表达式
     */
    @Value("#{52-20}")
    private Integer age;

    /**
     * 使用读取引入配置文件的值
     */
    @Value("${jdbc_username}")
    private String type;

    public Blue() {
        System.out.println(22);
    }


}
