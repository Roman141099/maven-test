package orika.test.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import orika.test.model.Man;
import orika.test.repository.ManRepository;

@RestController
public class ManEndpoint {

    @Autowired
    private ManRepository manRepository;

    @GetMapping("/create")
    public String createEmployee(){
        manRepository.save(new Man("sadf"));
        return "ok";
    }
}
