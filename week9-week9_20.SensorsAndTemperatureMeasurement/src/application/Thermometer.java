/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author kueky
 */
public class Thermometer implements Sensor{
    private boolean switchState;

    public Thermometer() {
        this.switchState = false;
    }

    @Override
    public boolean isOn() {
        return this.switchState;
    }

    @Override
    public void on() {
        this.switchState = true;
    } 

    @Override
    public void off() {
        this.switchState = false;
    }

    @Override
    public int measure() {
        if(isOn()){
            return new Random().nextInt( 30 + 31) - 30;
        }else{
            throw new IllegalStateException();
        }
    }
    
}
