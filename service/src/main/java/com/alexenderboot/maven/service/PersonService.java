package com.alexenderboot.maven.service;

import com.alexenderboot.maven.core.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//class realizing a json parsing logic

public class PersonService {
    public Person parse(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(json, Person.class);
        return person;
    }

    public String convert(Person person) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(person);
    }
}
