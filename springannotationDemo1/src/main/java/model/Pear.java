package model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 15:15
 */
@Primary
@Component
public class Pear implements Fruit {
    private String name;
}
