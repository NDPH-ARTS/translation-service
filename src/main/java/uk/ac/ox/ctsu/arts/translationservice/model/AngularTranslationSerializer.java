package uk.ac.ox.ctsu.arts.translationservice.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class AngularTranslationSerializer extends JsonSerializer<Translation> {
    @Override
    public void serialize(Translation translation, JsonGenerator generator, SerializerProvider provider)
        throws IOException {
        generator.writeStartObject();
        generator.writeStringField(translation.getKey(), translation .getValue());
        generator.writeEndObject();
    }
}
