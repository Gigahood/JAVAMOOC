/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author kueky
 */
public class Main {
   public static void main(String[] args) {
    Thermometer meter = new Thermometer();
meter.on();
AverageSensor ka = new AverageSensor();
ka.addSensor( meter);
ka.off();
ka.on();
       System.out.println(ka.isOn());
}
}
