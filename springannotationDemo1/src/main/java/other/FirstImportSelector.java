package other;

import model.Apple;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 15:29
 */
public class FirstImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        System.out.println(importingClassMetadata);
        //返回值需要注入的类的数组
        return new String[]{Apple.class.getName()};
    }
}
