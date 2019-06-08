package com.builder.BuilderJPA.util;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonUtils {

    public static String convertObjectToString(Object o) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		//used for helping  objectMapper to serialize/deserialize private fields in object
		mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
	}

	public static <T> T convertStringToObject(String s, Class<T> c) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		//used for helping  objectMapper to serialize/deserialize private fields in object
		mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
		return mapper.readValue(s, c);
	}


}
