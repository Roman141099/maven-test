package orika.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String personName;
    private Integer personAge;

    private Byte toExclude;

    private List<String> list;

    private Map<String, Integer> map;

    private String time;

}
