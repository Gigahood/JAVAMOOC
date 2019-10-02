
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
public class Calculator {
    private Reader reader ;
    private int count = 0;

    public Calculator() {
        this.reader = new Reader();
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                count++;
            } else if (command.equals("difference")) {
                difference();
                count++;
            } else if (command.equals("product")) {
                product();
                count++;
            }
            //System.out.println("");
            
        }

        statistics();
    }
    
    private void sum(){
        System.out.print("value 1 : ");
        int value1 = reader.readInteger();
        System.out.print("value 2 : ");
        int value2 = reader.readInteger();
        
        int total = value1 + value2;
        
        System.out.println("sum of the values : " + total);
        System.out.println("");
    }
    
    private void difference(){
        System.out.print("value 1 : ");
        int value1 = reader.readInteger();
        System.out.print("value 2 : ");
        int value2 = reader.readInteger();
        int total = value1 - value2;
        
        System.out.println("difference of the values " + total);
        System.out.println("");
    }
    
    private void product(){
        System.out.print("value 1 : ");
        int value1 = reader.readInteger();
        System.out.print("value 2 : ");
        int value2 = reader.readInteger();
        int total = value1 * value2;
        
        System.out.println("product of the values " + total);
        System.out.println("");
    }
    
    private void statistics(){
        System.out.println("Calculation done " + count);
    }
}
