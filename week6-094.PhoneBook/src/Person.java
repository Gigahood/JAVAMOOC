/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Person {
    private String phoneNo;
    private String name;

    public Person(String name, String phoneNo) {
        this.phoneNo = phoneNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return phoneNo;
    }
    
    public void changeNumber(String newNumber){
        this.phoneNo = newNumber;
    }

    @Override
    public String toString() {
        return this.name + " number: " + this.phoneNo;
    }
    
    
    
}
