package model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 13:15
 */
@Data
@Accessors(chain = true)
public class Green {
    private String name;
    private Integer type;
}
