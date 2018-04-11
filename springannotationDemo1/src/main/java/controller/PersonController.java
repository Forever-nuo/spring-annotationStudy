package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.PersonService;

/**
 * @author: Forever丶诺
 * @date: 2018/4/11 10:25
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;


    public  void testHasService(){
        System.out.println(personService);
    }

}
