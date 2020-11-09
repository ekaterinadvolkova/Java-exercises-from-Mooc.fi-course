/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author ekate
 */
public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }
    public void add(Person person){
        this.persons.add(person);
    }
    public boolean isEmpty(){
        if(this.persons.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    public Person shortest(){
        if (this.persons.isEmpty()) {
            return null;
        }
        // create an object reference for the object to be returned
        // its first value is the first object on the list
        Person returnObject = this.persons.get(0);

    // go through the list
        for (Person prs: this.persons) {
        // compare each object on the list
        // to the returnObject -- compare heights
            if (returnObject.getHeight() > prs.getHeight()) {
                returnObject = prs;
            }
        }
        return returnObject;
    }
    
    public Person take(){
//        Person lastShortest = this.persons.shortest();
        Person lastShortest=shortest();
        if(this.persons.isEmpty()){
            return null;
        } else{   
            this.persons.remove(shortest());               
        }
        return lastShortest;    
    }
    
}
