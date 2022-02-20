package orika.test;

import ma.glasnost.orika.MapperFactory;
import orika.test.dto.Person;
import orika.test.dto.Personne;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import orika.test.mapper.PersonMapper;

import java.io.File;
import java.util.Arrays;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class MapperTest {

    static PersonMapper mapper = AppContextUtil.getContext().getBean(PersonMapper.class);

    @Test
    public void testMapAToB(){
        Person person = Person.builder()
                .time("2021-10-10T14:10:10")
                .personAge(1)
                .personName("PersonName")
                .toExclude((byte)12)
                .list(Arrays.asList("first", "second"))
                .map(Map.of("first", 1, "second", 2))
                .build();

        Personne mapped = mapper.map(person);

        //test
        System.out.println();
    }

    @Test
    public void testMapBToA(){
        Personne personne = Personne.builder()
                .personneName("PersonneName")
                .personneAge(2)
                .toExclude(12345)
                .build();

        Person mapped = mapper.map(personne);

        assertThat(mapped)
                .hasFieldOrPropertyWithValue("personName", personne.getPersonneName())
                .hasFieldOrPropertyWithValue("personAge", personne.getPersonneAge());
    }

    @Test
    public void testBothMap(){
        Person person = Person.builder()
                .personAge(1)
                .personName(null)
                .toExclude((byte)12)
                .list(Arrays.asList("first", "second"))
                .map(Map.of("first", 1, "second", 2))
                .build();

        Personne personne = Personne.builder()
                .personneName("PersonneName")
                .personneAge(2)
                .toExclude(12345)
                .build();

        mapper.map(person, personne);

        System.out.println();
    }
}
