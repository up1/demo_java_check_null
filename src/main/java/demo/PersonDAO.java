package demo;

import java.util.Optional;

public class PersonDAO {
    
    public Optional<Person> getPersonByID(int personID){
        Optional<Person> person = Optional.empty();
        return person ;
    }

    public Person getPersonByID(int i, Action<Person> action) {
        return null;
    }

}
