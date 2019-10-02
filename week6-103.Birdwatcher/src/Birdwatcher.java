
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
public class Birdwatcher {
    private ArrayList<Bird> birds = new ArrayList<Bird>();

    public Birdwatcher() {
    }
    
    public void addBird(Bird bird){
        
        this.birds.add(bird);
    }
    
    public boolean observation(String bird){
        for(Bird birdss : birds){
            if(birdss.getName().contains(bird) || birdss.getLatinName().contains(bird)){
                birdss.observed();
                return true;
            }
        }
        
        System.out.println("Is not a bird!");
        return false;
    }
    
    public void statistics(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }
    
    public void show(String name){
        for(Bird bird : birds){
            if(bird.getName().equals(name)){
                System.out.println(bird);
                return;
            }
        }
    }
}
