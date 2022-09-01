package ru.service;

import ru.models.Person;

import java.util.List;

public interface PersonService {

    public List<Person> index();

    public Person show(int id);

    public void save(Person person);

    public void update(int id, Person updatedPerson);

    public void delete(int id);

}
