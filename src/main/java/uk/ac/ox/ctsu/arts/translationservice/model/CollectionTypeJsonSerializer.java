package uk.ac.ox.ctsu.arts.translationservice.model;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.util.ArrayList;
import java.util.List;

public class CollectionTypeJsonSerializer extends SimpleSerializers {

  @Override
  public JsonSerializer<?> findCollectionSerializer(SerializationConfig config,
                                                    CollectionType type,
                                                    BeanDescription beanDesc,
                                                    TypeSerializer elementTypeSerializer,
                                                    JsonSerializer<Object> elementValueSerializer) {
    CollectionType translationStringArrayListType = TypeFactory.defaultInstance()
                                                            .constructCollectionType(ArrayList.class, Translation.class);

    CollectionType translationStringListType = TypeFactory.defaultInstance()
        .constructCollectionType(List.class, Translation.class);

    if (type.equals(translationStringArrayListType) || type.equals(translationStringListType)) {
      return new AngularBundleSerializer();
    }

    return findSerializer(config, type, beanDesc);
  }


}
