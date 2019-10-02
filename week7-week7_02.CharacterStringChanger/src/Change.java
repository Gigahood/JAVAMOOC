/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public char getFromCharacter() {
        return fromCharacter;
    }

    public char getToCharacter() {
        return toCharacter;
    }
    
    
    
    public String change(String characterString){
        int length = characterString.length();
        char character = characterString.charAt(0);
        String newString = "";
        
        for(int i = 0; i < length; i++){
            character = characterString.charAt(i);
            
            if(character == fromCharacter){
                newString += toCharacter;
            }else{
                newString += character;
            }
        }
        
        return newString;
    }
    
    
//    public String change(String characterString){
//        String newString = characterString.replace(fromCharacter, toCharacter);
//        
//        return newString;
//    }

    @Override
    public String toString() {
        return this.fromCharacter + " " + this.toCharacter;
    }
}
