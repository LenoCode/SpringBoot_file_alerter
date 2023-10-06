package ai.atmc.hawkadoccollector.config.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class ApplicationContextProvider implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextProvider.applicationContext = applicationContext;
    }

    /**
     * Returns the context of current spring boot app.
     * Meaning in this context are all Beans saved
     *
     * @return
     */
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
}
