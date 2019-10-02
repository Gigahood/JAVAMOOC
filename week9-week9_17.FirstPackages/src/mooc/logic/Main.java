/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.mooc.logic;
import src.mooc.logic.ApplicationLogic;
import src.mooc.ui.UserInterface;
import src.mooc.ui.TextUserInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
  