
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class RandomNumber {
    
    
    public static int randomNumber(int max, int min){
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
