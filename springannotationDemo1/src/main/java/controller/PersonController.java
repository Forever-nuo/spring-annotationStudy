package controller;

import model.Fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import service.PersonService;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 10:25
 */
@Controller
public class PersonController {

    /**
     * an类型进行匹配
     */
    @Autowired
    private PersonService personService;

    /**
     * required 设置为False 可以注入为Null
     */
    @Autowired(required = false)
    private Fruit fruit1;

    /**
     * 指定匹配
     */
    @Qualifier("apple")
    @Autowired
    private Fruit fruit;

    /**
     * 匹配
     */
    @Autowired
    private Fruit pear;

    public void testHasService() {
        System.out.println(personService);
    }

    public void sayService() {

        personService.say();
    }

    public Fruit getFruit(){
        return  fruit;
    }

    public Fruit getPear(){
        return  pear;
    }

}
