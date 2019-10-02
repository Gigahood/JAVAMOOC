/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mooc.logic;

import src.mooc.ui.UserInterface;

/**
 *
 * @author kueky
 */
public class ApplicationLogic {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    
    public void execute(int howManyTimes){
        for(int i = 0; i < howManyTimes; i++){
            System.out.println("The application logic works");
            ui.update();
        }
    }
}
