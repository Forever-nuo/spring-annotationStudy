package controller;

import org.springframework.stereotype.Controller;
import service.PersonService2;

import javax.annotation.Resource;
import java.lang.reflect.Type;

/**
 * @author: Forever丶诺
 * @date: 2018/4/12 14:39
 */
@Controller
public class PersonController2 {

    /**
     * 属性 personService2 默认值
     */
    @Resource
    private PersonService2 personService2;

    /**
     * 使用Name属性
     */
    @Resource(name="personService2")
    private PersonService2 personService4;

    /**
     *使用Type属性
     */
    @Resource(type=PersonService2.class)
    private PersonService2 personService5;


    public PersonService2 getPersonService2() {
        personService2.say();
        return personService2;
    }
    public PersonService2 getPersonService4() {
        personService4.say();
        return personService4;
    }


    public PersonService2 getPersonService5() {
        personService5.say();
        return personService5;
    }
}
