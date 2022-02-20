package orika.test.mapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import orika.test.dto.Person;
import orika.test.dto.Personne;
import ma.glasnost.orika.MapperFactory;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.yaml")
public class PersonMapper extends AbstractMapper{

    @Override
    public void configure(MapperFactory mapperFactory) {
        mapperFactory.classMap(Person.class, Personne.class)
                .mapNulls(false)
                .exclude("toExclude")
                .field("personName", "personneName")
                .field("personAge", "personneAge")
                .field("list[0]", "firstElement")
                .field("list[1]", "secondElement")
                .field("map['first']", "firstVal")
                .field("map['second']", "secondVal")
                .fieldMap("time", "time").converter("StringToLocalDateTimeConverter").add()
                .register();
    }

    public Personne map(Person from){
        return mapperFactory.getMapperFacade(Person.class, Personne.class).map(from);
    }

    public Person map(Personne from){
        return mapperFactory.getMapperFacade(Person.class, Personne.class).mapReverse(from);
    }

    public void map(Person from, Personne to){
        mapperFactory.getMapperFacade(Person.class, Personne.class).map(from, to);
    }
}
