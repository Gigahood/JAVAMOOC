
import java.util.ArrayList;
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
public class Dictionary {
    private HashMap<String, String> dictionaries = new HashMap<String, String>();

    public Dictionary() {
    }
    
    public String translate(String word){
        if(this.dictionaries.containsKey(word)){
            return dictionaries.get(word);
        }else{
            return null;
        }
    }
    
    public void add(String word, String tanslation){
        this.dictionaries.put(word, tanslation);
    }
    
    public int amountOfWords(){
        return this.dictionaries.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> list = new ArrayList<String>();
        
        for(String key : this.dictionaries.keySet()){
            list.add(key + " = " + this.dictionaries.get(key));
        }
        
        return list;
    }
}
