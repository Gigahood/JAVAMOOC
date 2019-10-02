
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
public class Box implements ToBeStored{
    private double totalWeight;
    private ArrayList<ToBeStored> boxItems = new ArrayList<ToBeStored>();

    public Box(double totalWeight) {
        this.totalWeight = totalWeight;
    }
    
    public void add(ToBeStored tb){
        double afterAddedWeight = this.weight() + tb.weight();
        
        if(afterAddedWeight <= totalWeight){
            this.boxItems.add(tb);
        }
    }
            
    @Override
    public double weight() {
        double currentWeight = 0;
        
        for(ToBeStored item : boxItems){
            currentWeight += item.weight();
        }
        
        return currentWeight;
    }

    @Override
    public String toString() {
        return "Box: " + boxItems.size() + " things, total weight " + this.weight() + " kg";
    }
    
    
    
}
