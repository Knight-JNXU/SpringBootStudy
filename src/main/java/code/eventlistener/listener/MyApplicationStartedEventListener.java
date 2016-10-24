package code.eventlistener.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Knigh on 2016/10/23.
 * spring boot 启动监听类
 */
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    private Logger logger = LoggerFactory.getLogger(MyApplicationStartedEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        SpringApplication app = applicationStartedEvent.getSpringApplication();
        logger.info("==MyApplicationStartedEventListener==");
    }
}
