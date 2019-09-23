/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class StringUtils {
    
    public static boolean included(String word, String searched){
         String modifiedSearched = searched.trim().toUpperCase();
         String modifiedWord = word.toUpperCase();
         
        return modifiedWord.contains(modifiedSearched);
    }
}
