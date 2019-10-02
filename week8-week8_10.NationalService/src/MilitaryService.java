/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class MilitaryService implements NationalService{
    private int dayLeft;

    public MilitaryService(int dayLeft) {
        this.dayLeft = dayLeft;
    }
    
    
    
    @Override
    public int getDaysLeft() {
        this.dayLeft = dayLeft;
        return this.dayLeft;
    }

    @Override
    public void work() {
        if(this.dayLeft > 0){
            this.dayLeft--;
        }
    }

 
}
