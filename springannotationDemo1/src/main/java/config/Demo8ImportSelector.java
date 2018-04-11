package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import other.FirstImportSelector;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 15:51
 */

@Configuration
@Import({FirstImportSelector.class})
public class Demo8ImportSelector {
}
