package code.base.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Knigh on 2016/10/23.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"code.controller"})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
