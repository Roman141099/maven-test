package orika.test.mapper.converter;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

import java.time.LocalDateTime;

public class StringToLocalDateTimeConverter extends CustomConverter<String, LocalDateTime> {
    @Override
    public LocalDateTime convert(String s, Type<? extends LocalDateTime> type) {
        return LocalDateTime.parse(s);
    }
}
