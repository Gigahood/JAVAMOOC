
import static java.lang.Integer.*;
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
public class Reader {
    private Scanner reader = new Scanner(System.in);
    public String readString(){
        return reader.nextLine();
    }
    
    public int readInteger(){
        return Integer.parseInt(reader.nextLine());
    }
    
}
