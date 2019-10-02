
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
public class Suitcase {
    private int maxWeight;
    private int currentWeight = 0;
    private ArrayList<Thing> things = new ArrayList<Thing>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void addThing(Thing thing){
        int checkingWeight = currentWeight + thing.getWeight();
        if(maxWeight >= checkingWeight){
            things.add(thing);
            currentWeight += thing.getWeight();
        }
    }
    
    public void printThings(){
        for(Thing thing : things){
            System.out.println(thing.getName() + " (" + thing.getWeight() + "kg)");
        }
    }
    
    public int totalWeight(){
        return this.currentWeight;
    }
    
    public Thing heaviestThing(){
        if(things.isEmpty()){
            return null;
        }else{
            Thing heaviest = things.get(0);
            
            for(Thing thing : things){
                if(thing.getWeight() > heaviest.getWeight()){
                    heaviest = thing;
                }
            }
            return heaviest;
        }
    }

    @Override
    public String toString() {
        String size;
        
        if(things.isEmpty()){
            size = "empty";
        }else if(things.size() == 1){
            size = Integer.toString(things.size()) + " thing";
        }
        
        else{
            size = Integer.toString(things.size()) + " things";
        }
        
        return size + " (" + this.currentWeight + "kg)";
    }
    
    
}
