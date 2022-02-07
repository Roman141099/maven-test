package dtos;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Personne {

    private String personneName;
    private Integer personneAge;
}
