package htw.berlin.webtech.demo.web;

import htw.berlin.webtech.demo.web.api.Persons;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonenController {
    private List<Persons> persons;

    public PersonenController(){
        persons = new ArrayList<>();
        persons.add(new Persons(1, "holga", "frank", false));
        persons.add(new Persons(1, "eywa", "null", false));
    }

    @GetMapping(path = "/api/v1/persons")
    public ResponseEntity<List<Persons>> fetchPersons(){
        return ResponseEntity.ok(persons);
            }
}
