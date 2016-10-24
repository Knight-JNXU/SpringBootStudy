package code.eventlistener.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import java.util.Iterator;

/**
 * Created by Knigh on 2016/10/23.
 */
public class MyApplicationEnvironmentPrepareEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    private Logger logger = LoggerFactory.getLogger(MyApplicationEnvironmentPrepareEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
        ConfigurableEnvironment envi = applicationEnvironmentPreparedEvent.getEnvironment();
        MutablePropertySources mps = envi.getPropertySources();
        if(mps != null){
            Iterator<PropertySource<?>> iter = mps.iterator();
            while (iter.hasNext()){
                PropertySource<?> ps = iter.next();
                logger.info("ps.getName:{};ps.getSource:{};ps.getClass:{}", ps.getName(), ps.getSource(), ps.getClass());
            }
        }
    }
}
