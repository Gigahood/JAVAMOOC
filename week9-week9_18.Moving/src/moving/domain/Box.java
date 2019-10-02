/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kueky
 */
public class Box implements Thing{
    private int maximumCapacity;
    private List<Thing> items = new ArrayList<Thing>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }
    
    public boolean addThing(Thing thing){
        if((this.getVolume() + thing.getVolume()) > this.maximumCapacity ){
            return false;
        }
        
        items.add(thing);
        return true;
    }

    @Override
    public int getVolume() {
        int total = 0;
        
        for(Thing item : items){
            total += item.getVolume();
        }
        
        return total;
    }
}
