package dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    private String personName;
    private Integer personAge;


}
