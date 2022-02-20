package orika.test.mapper;

import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public abstract class AbstractMapper {

    @Autowired
    protected MapperFactory mapperFactory;

    public abstract void configure(MapperFactory mapperFactory);

    @PostConstruct
    private void init(){
        configure(mapperFactory);
    }

}
