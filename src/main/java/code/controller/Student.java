package code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Knight_JXNU on 2016/9/29.
 */
@Controller
public class Student {

    @RequestMapping("/welcome")
    public String goWelcome(){
        return "welcome";
    }

}
