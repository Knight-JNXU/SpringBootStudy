package code.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Knight_JXNU on 2016/9/29.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"code.controller,code.config"})
public class WebApp {

    public static void main(String args[]){
        SpringApplication.run(WebApp.class, args);
    }

}
