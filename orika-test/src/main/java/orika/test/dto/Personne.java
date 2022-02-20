package orika.test.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Personne {

    private String personneName;
    private Integer personneAge;

    private Integer toExclude;

    private String firstElement;
    private String secondElement;

    private Integer firstVal;
    private Integer secondVal;

    private LocalDateTime time;
}
