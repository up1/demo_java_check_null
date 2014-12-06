package demo;

import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class PersonDAOTest {

    @Test
    public void call() throws PersonNotFoundException {
        PersonDAO personDAO = new PersonDAO();
        Optional<Person> personO = personDAO.getPersonByID(1);
        personO.map(person -> person.getName()).orElse("Unknown");
    }

    @Test
    public void call2() {
        PersonDAO personDAO = new PersonDAO();
        int personID = 1;

        personDAO.getPersonByID(personID, new Action<Person>() {
            public void act(Person person) {
                person.setName("My name");
            }
        });

    }

}
