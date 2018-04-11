package model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 8:54
 */
@Data
@Accessors(chain = true)
@Component
public class Person {

    private String name;
    private Integer age;

    public Person() {
        System.out.println("Person对象创建");
    }
}
