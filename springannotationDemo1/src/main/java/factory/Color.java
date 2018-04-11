package factory;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 16:35
 */

@Data
@Accessors(chain = true)
public class Color {
    private String name;
}
