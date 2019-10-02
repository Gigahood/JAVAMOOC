
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Storehouse {
    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
        if(prices.containsKey(product)){
            return prices.get(product);
        }else{
            return -99;
        }
    }
    
    public int stock(String product){
        if(stocks.containsKey(product)){
            return stocks.get(product);
        }else{
            return 0;
        }
    }
    
    public boolean take(String product){
        if(this.stock(product) == 0){
            return false;
        }else{
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
    }
    
    public Set<String> products(){
        return prices.keySet();
    }
}
