package orika.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContextUtil {

    public static ApplicationContext getContext(){
        return new AnnotationConfigApplicationContext("orika.test");
    }

}
