
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class PromissoryNote {
    private HashMap<String, Double> notes = new HashMap<String, Double>();
    
    public  PromissoryNote(){
        
    }
    
    public void setLoan(String toWhom, double value){
        //toWhom = stringCleaner("toWhom");
        
        notes.put(toWhom, value);
    }
    
//    private String stringCleaner(String word){
//        word = word.toLowerCase();
//        
//        return word.trim();
//    }
    
    public double howMuchIsTheDebt(String whose){
        //whose = stringCleaner(whose);

        if(this.notes.containsKey(whose)){
            return notes.get((whose));
        }else{
            return 0;
        }
    }
}
