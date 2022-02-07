package orika.test;


import dtos.Person;
import dtos.Personne;

import static orika.test.MapperFactoryUtil.mapperFactory;

public class Main {

    public static void main(String[] args) {
        mapperFactory.classMap(Person.class, Personne.class)
                .field("personName", "personneName")
                .field("personAge", "personneAge")
                .register();

        Person person = Person.builder()
                .personName("PersonName")
                .build();

        Personne personne = Personne.builder()
                .personneAge(123)
                .build();

        Personne mapped = mapperFactory.getMapperFacade(Person.class, Personne.class)
                .map(person, personne);
        System.out.println();
    }

}
