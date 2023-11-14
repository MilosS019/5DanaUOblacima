package com.example.demo.JsonSerializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class CustomFloatSerializer extends JsonSerializer<Float> {

    @Override
    public void serialize(Float aFloat, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(String.format("%.1f", aFloat));
    }
}
