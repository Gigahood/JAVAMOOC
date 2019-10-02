
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class ShoppingBasket {
    private List<Purchase> baskets = new ArrayList<Purchase>();

    public ShoppingBasket() {
    }
    
    public void add(String product, int price){
        for(Purchase item : baskets){
            if(item.getProduct().equals(product)){
               item.increaseAmount();
               return;
            }
        }
        Purchase item = new Purchase(product, 1, price);
        baskets.add(item);

    }
    
    public int price(){
        int total = 0;
        
        for(Purchase item : baskets){
            total += item.price();
        }
        
        return total;
    }
    
    public void print(){
        for(Purchase item : baskets){
            System.out.println(item.toString());
        }
    }
    
    
    
}
