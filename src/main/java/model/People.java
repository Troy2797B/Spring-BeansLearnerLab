package model;

import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

}
