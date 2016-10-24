package code.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Knigh on 2016/10/23.
 * 最基本的controller
 */
@RestController
@RequestMapping(value = "/springboot")
public class HelloWorldController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello world!";
    }

}
