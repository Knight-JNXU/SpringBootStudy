package code.eventlistener.applicaton;

import code.eventlistener.listener.MyApplicationStartedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Knigh on 2016/10/23.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new MyApplicationStartedEventListener());
        app.run(args);
    }
}
