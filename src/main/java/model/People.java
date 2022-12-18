package model;

import java.util.List;
import java.util.Objects;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {

    List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public void add (PersonType type){
        personList.add(type);
    }
    public void remove (PersonType type){
        personList.remove(type);
    }

    public int size(){
        return personList.size();
    }
    public void clear(){
        personList.clear();
    }
    public void addAll(Iterable<PersonType> personTypes){
        for (PersonType p: personTypes) {
            personList.add(p);
        }
    }
    public PersonType findById(Long id){
        for (PersonType p: personList) {
            if (Objects.equals(p.getId(), id)){
                return p;
            }
        } return null;
    }

}
