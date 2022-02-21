package orika.test.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import orika.test.dto.Person;
import orika.test.dto.Personne;

import javax.annotation.PostConstruct;

@Configuration
@ConfigurationProperties(prefix = "config-props")
@Data
public class PropSourceConfig {

    private String first;
    private String second;
    private Person person;

    @PostConstruct
    public void testProps(){
        System.out.println();
    }

    @Bean
    @ConfigurationProperties(prefix = "personne")
    public Personne personne(){
        return new Personne();
    }


}
