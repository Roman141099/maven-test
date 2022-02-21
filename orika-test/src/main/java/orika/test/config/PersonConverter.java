package orika.test.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import orika.test.dto.Person;

@Component
@ConfigurationPropertiesBinding
public class PersonConverter implements Converter<String, Person> {
    @Override
    public Person convert(String s) {
        String[] splitted = s.split("\\s?,");
        return Person.builder()
                .personName(splitted[0])
                .personAge(Integer.parseInt(splitted[1]))
                .build();
    }
}
