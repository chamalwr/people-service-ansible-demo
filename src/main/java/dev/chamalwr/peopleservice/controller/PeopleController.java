package dev.chamalwr.peopleservice.controller;

import dev.chamalwr.peopleservice.model.Person;
import dev.chamalwr.peopleservice.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    private PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping()
    public List<Person> getAllPeople() {
        return this.peopleService.getAllPeople();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable String id){
        return this.peopleService.getPersonById(Long.parseLong(id));
    }

    @PostMapping()
    public Person addPerson(@RequestBody Person person){
        return this.peopleService.addPerson(person);
    }

}
