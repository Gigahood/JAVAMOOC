
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Team {
    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize = 16;
    //private int size;
    //private int goals;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player){
        if(this.players.size() < maxSize){
           this.players.add(player);
        }
        
    }
    
    public int goals(){
        int totalGoals = 0;
        
        for(Player player : players){
            totalGoals += player.goals();
        }
        
        return + totalGoals;
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return this.players.size();
    }
    
    public void printPlayers(){
        for(Player player : players){
            System.out.println(player);
        }
    }
    
}
