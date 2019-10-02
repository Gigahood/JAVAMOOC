
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
public class Container {
    private int limit;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();

    public Container(int limit) {
        this.limit = limit;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int checkingWeight = totalWeight + suitcase.totalWeight();
        
        if(limit >= checkingWeight){
            this.suitcases.add(suitcase);
            this.totalWeight += suitcase.totalWeight();
        }
    }
    
    public void printThings(){
        for(Suitcase suitcase : suitcases){
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight + "kg)";
    }
    
    
    
}
