package orika.test.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Configuration
public class InjectCollectionsConfig {

    @Value("${collections.list}")
    private List<String> list;
    @Value("#{'${collections.list2}'.split(';')}")
    private List<String> lis2;
    private Map<String, String> map;


    @PostConstruct
    public void check(){
        System.out.println();
    }




}
