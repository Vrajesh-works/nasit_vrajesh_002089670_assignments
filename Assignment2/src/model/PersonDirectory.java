/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author dhyeyrabadia
 */
public class PersonDirectory {
    private ArrayList<Person> persons;
    
    public PersonDirectory(){
        persons = new ArrayList<Person>();
    }
    
    // get all persons
    public ArrayList<Person> getPersons(){
        return persons;
    }
    
     public void setPersons(ArrayList<Person> persons){
        this.persons = persons;
    }
     
    // add person
    public Person addPerson(){
        Person p = new Person();
        persons.add(p);
        return p;
    }
    
    // delete person
    public void deletePerson(Person person){
        persons.remove(person);
    }
    
    public Person searchPerson(String query) {
        for (Person person : persons) {
            if (person.getFirstName().equalsIgnoreCase(query) || 
                person.getLastName().equalsIgnoreCase(query) ||
                person.getHomeAddress().getStreetAddress().equalsIgnoreCase(query)) {
                return person;
            }
        }
        return null; // No match found
    }
}
