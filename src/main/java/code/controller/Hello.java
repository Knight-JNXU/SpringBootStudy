package code.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Knight_JXNU on 2016/9/29.
 */

/**
 * RestController 是 spring 4.0 推出的新特性
 * 使用其标注表示当前类为一个 @Controller，并且
 * 使用 @RequestMapping 所标注的方法的返回值默认会被认为使用
 * 了 @ResponseBody 进行标注，因此不再使用视图解析的方式进行处理
 * 而是将内容通过 http 响应体返回给客户端
 */
@RestController
public class Hello {

    /**
     * spring boot 会自动读取application.properties
     * 并且将其作为系统参数进行注入，用户也可以在启动应用的时候
     * 通过 -Dname=xxx 来手动注入，手动注入会覆盖配置文件中的参数
     * 如果没有指定值，那么name的默认值就是 world
     */
    @Value("${name:world}")
    private String name;

    /**
     * 由于使用了@RestController，因此无需再使用 @ResponseBody 来标注返回的结果
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello(){
        return String.format("hello:%s", name);
    }

}
