package factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 16:31
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    /**
     * 返回工厂对象返回的实体对象
     *
     * @return
     * @throws Exception
     */
    @Override
    public Color getObject() throws Exception {
        return new Color().setName("红色");
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * 是否是单例的工厂对象
     *
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
