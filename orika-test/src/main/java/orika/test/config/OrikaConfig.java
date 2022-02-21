package orika.test.config;

import lombok.Getter;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import orika.test.mapper.converter.StringToLocalDateTimeConverter;

@Configuration
@Getter
public class OrikaConfig {

    @Value("${orika.map-nulls}")
    Boolean mapNulls;

    @Bean
    public MapperFactory mapperFactory() {
        DefaultMapperFactory build = new DefaultMapperFactory.Builder()
                .mapNulls(mapNulls)
                .build();
        ConverterFactory converterFactory = build.getConverterFactory();
        converterFactory.registerConverter("StringToLocalDateTimeConverter", new StringToLocalDateTimeConverter());
        return build;
    }

}
