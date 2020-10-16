package uk.ac.ox.ctsu.arts.translationservice.config;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import uk.ac.ox.ctsu.arts.translationservice.model.CollectionTypeJsonSerializer;

import java.util.ArrayList;

@Configuration
public class JacksonConfig {
    @Bean
    public ObjectMapper jsonObjectMapper() {
        ArrayList<Module> modules = new ArrayList<>();

        //CollectionType Serialization
        SimpleModule collectionTypeSerializerModule = new SimpleModule();
        collectionTypeSerializerModule.setSerializers(new CollectionTypeJsonSerializer());
        modules.add(collectionTypeSerializerModule);

        return Jackson2ObjectMapperBuilder.json()
                                          .modules(modules)
                                          .build();
    }
}
