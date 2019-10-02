/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author kueky
 */
public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        ArrayList<Box> boxes = new ArrayList<Box>();
        int counter = 0;
        
        while(true){
            Box box = new Box(this.boxesVolume);
            for(int i = counter; i < things.size(); i++){
                if(!box.addThing(things.get(i))){
                    break;
                }
                
                counter++;
            }
            boxes.add(box);
            if(counter == things.size()){
                break;
            }
        }
        
        return boxes;
    }
    
}
