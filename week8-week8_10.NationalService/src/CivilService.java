/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class CivilService implements NationalService{
    private int dayLeft;
    
    public CivilService() {
        this.dayLeft = 362;
    }
    @Override
    public int getDaysLeft() {

       
       return this.dayLeft;
    }

    @Override
    public void work() {
       if(this.dayLeft > 0){
           this.dayLeft--;
       }
    }
    
}
