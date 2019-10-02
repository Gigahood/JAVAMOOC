/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Bird {
    private String name;
    private String latinName;
    private int numberOfObserved;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.numberOfObserved = 0;
    }

    public String getLatinName() {
        return latinName;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfObserved() {
        return numberOfObserved;
    }
    
    public void observed(){
        this.numberOfObserved++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.numberOfObserved + " observations";
    }
    
    
}
