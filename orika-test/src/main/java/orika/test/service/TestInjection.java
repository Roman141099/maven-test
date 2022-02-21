package orika.test.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import orika.test.dto.Personne;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class TestInjection {

    private final Personne personne;

    @PostConstruct
    public void check(){
        System.out.println();
    }

}
