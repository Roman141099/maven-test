package orika.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import orika.test.dto.Person;
import orika.test.dto.Personne;
import orika.test.mapper.PersonMapper;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
