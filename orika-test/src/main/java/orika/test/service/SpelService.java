package orika.test.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SpelService {

    @Value("#{2+1}")
    Integer sumResult;

    @Value("#{'str1' + 'str2'}")
    String stringSum;

    @Value("#{2 le 3}")
    boolean lessThan;

    @Value("#{orikaConfig.mapNulls.toString()}")
    String fromBean;

    @Value("#{'123' matches '\\d+'}")
    Boolean matches;

    @PostConstruct
    public void check(){
        System.out.println();
    }

}
