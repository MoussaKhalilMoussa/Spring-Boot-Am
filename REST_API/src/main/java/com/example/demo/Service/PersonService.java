package com.example.demo.Service;

import com.example.demo.dao.PersonDae;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class PersonService {
    private final PersonDae personDae;
    @Autowired
    public PersonService(@Qualifier("postgres")PersonDae personDae) {
        this.personDae = personDae;
    }

    public int addPerson(Person person){
        return personDae.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDae.getAllPeople();
    }

    public Optional <Person> getPersonByID(UUID id){
        return personDae.selectPersonById(id);
    }

    public int deletePerson (UUID id){
        return personDae.deletePersonById(id);
    }
     public int updatePerson (UUID id , Person newPerson){
        return personDae.updatePersonById(id, newPerson);
     }
}
