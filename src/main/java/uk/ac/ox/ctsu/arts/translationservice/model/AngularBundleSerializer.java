package uk.ac.ox.ctsu.arts.translationservice.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.util.List;

@JsonComponent
public class AngularBundleSerializer extends JsonSerializer<List<Translation>> {
    @Override
    public void serialize(List<Translation> translations, JsonGenerator generator, SerializerProvider provider)
        throws IOException {
        generator.writeStartObject();

        for (Translation t : translations) {
            generator.writeStringField(t.getKey(), t.getValue());
        }

        generator.writeEndObject();
    }
}
