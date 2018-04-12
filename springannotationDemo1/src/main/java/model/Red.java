package model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.security.PrivateKey;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 9:29
 */
@Data
@Accessors(chain=true)
public class Red implements ApplicationContextAware {

    private ApplicationContext context;

    private String name;



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}