
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class TextUserInterface {
     private Scanner reader;
     private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
     public void start(){
         String input = "";
         
         System.out.println("Statement:\nadd - adds a word pair to the dictionary");
         System.out.println("translate - asks a word and prints its translation ");
         System.out.println("quit - quits the text user interface");
         System.out.println("");
         
         do{
            System.out.print("Statment : "); 
            input = reader.nextLine();
            
            if(input.equals("quit")){
                System.out.println("Cheers!\n");
            }else if(input.equals("translate")){
                translate();
            }else if(input.equals("add")){
                add();
            }else{
                System.out.println("Unknown Statement!");
            }
             System.out.println("");
            
         }while(!input.equals("quit"));
         
     }
     
     public void add(){
         String original;
         String translate;
         
         System.out.print("In Finnish: ");
         original = reader.nextLine();
         System.out.print("Translation: ");
         translate = reader.nextLine();
         this.dictionary.add(original, translate);
     }
     
     public void translate(){
         String original;
         
         System.out.print("Give a word: ");
         original = reader.nextLine();
         System.out.print("Translation: " + this.dictionary.translate(original));
         
     }
             
}
