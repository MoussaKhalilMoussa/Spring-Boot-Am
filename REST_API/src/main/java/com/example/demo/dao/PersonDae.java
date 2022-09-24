package com.example.demo.dao;

import com.example.demo.model.Person;
import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDae {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }

    List<Person> getAllPeople();
    Optional<Person>selectPersonById(UUID id);
    int deletePersonById(UUID id);
    int updatePersonById(UUID id , Person person);
}
