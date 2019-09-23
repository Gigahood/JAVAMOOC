/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Player {
    private String name;
    private int goals;

    public Player(String name, int amtOfGoals) {
        this.name = name;
        this.goals = amtOfGoals;
    }

    public String getName() {
        return name;
    }
    
    
    
    public Player(String name) {
        this.name = name;
    }

    public int goals() {
        return goals;
    }

    @Override
    public String toString() {
        return this.name + ", goals " + this.goals;
    }
    
    
    
    
}
