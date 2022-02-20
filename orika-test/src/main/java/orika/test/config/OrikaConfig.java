package orika.test.config;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import orika.test.mapper.converter.StringToLocalDateTimeConverter;

@Configuration
public class OrikaConfig {

    @Bean
    public MapperFactory mapperFactory(){
        DefaultMapperFactory build = new DefaultMapperFactory.Builder().build();
        ConverterFactory converterFactory = build.getConverterFactory();
        converterFactory.registerConverter( "StringToLocalDateTimeConverter", new StringToLocalDateTimeConverter());
        return build;
    }

}
