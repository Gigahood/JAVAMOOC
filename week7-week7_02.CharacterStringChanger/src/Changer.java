
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
public class Changer {
    private ArrayList<Change> changes = new ArrayList<Change>();
    
    public Changer(){
         
    }
    
     public void addChange(Change change){
         this.changes.add(change);
     }
     
    public String change(String characterString){
        String newString = characterString;
        
        for(Change change : changes){
           newString = change.change(newString);
           System.out.println(newString);
        }
        
        return newString;
    }
}
