package code.eventlistener.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Knigh on 2016/10/24.
 */
public class MyApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {
    private Logger logger = LoggerFactory.getLogger(MyApplicationPreparedEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        ConfigurableApplicationContext cac = applicationPreparedEvent.getApplicationContext();

    }

    /**
     * 传递上下文
     * @param cac
     */
    private void passContextInfo(ApplicationContext cac){

    }
}
