
import java.io.File;
import java.io.FileNotFoundException;
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
public class Printer {
    private File file;
    
    public Printer(String fileName) throws Exception{
        this.file = new File(fileName);
    }
    
     public void printLinesWhichContain(String word) throws FileNotFoundException{
         // read file
         Scanner reader = new Scanner(this.file, "UTF-8");
         String line;
         while (reader.hasNextLine()){
             line = reader.nextLine();
             if(line.contains(word)){
                 System.out.println(line);
             }
         }
         
         //require to close after finish reading the file
         reader.close();
     }
}
