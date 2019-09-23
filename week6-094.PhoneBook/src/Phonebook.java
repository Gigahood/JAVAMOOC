
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Phonebook {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public Phonebook() {
    }
    
    public void add(String name, String number){
        Person person = new Person(name, number);
        
        this.persons.add(person);
    }
    
    public void printAll(){
        for(Person person : persons){
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name){
        for(Person person : persons){
            if(person.getName().equals(name)){
                return person.getNumber();
            }
        }
        
        return "number not known";
    }
    
}
