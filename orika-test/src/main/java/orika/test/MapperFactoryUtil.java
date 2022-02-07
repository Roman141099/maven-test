package orika.test;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class MapperFactoryUtil {

    public static final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().mapNulls(false).build();


}
