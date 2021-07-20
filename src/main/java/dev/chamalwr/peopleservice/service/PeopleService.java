package dev.chamalwr.peopleservice.service;

import dev.chamalwr.peopleservice.model.Person;
import dev.chamalwr.peopleservice.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {

    private PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> getAllPeople(){
        return this.peopleRepository.findAll();
    }

    public Person getPersonById(Long id){
        return this.peopleRepository.getById(id);
    }

    public Person addPerson(Person person) {
        return this.peopleRepository.save(person);
    }
}
