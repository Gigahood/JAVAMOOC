
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
public class Airplane {
    private String planeID;
    private int capacity;
    private ArrayList<Flight> flights = new ArrayList<Flight>();


    public Airplane() {
    }
    
    public Airplane(String planeID, int capacity) {
        this.planeID = planeID;
        this.capacity = capacity;
    }
    
    public void addFlight(Flight flight){
        this.flights.add(flight);
    }
    
    public void printAirplaneInfo(){
        System.out.println(this.planeID + " (" + this.capacity + " ppl) ");
    }

    @Override
    public String toString() {
        String planInfo = "";
        
        for(Flight flight : flights){
            planInfo += (this.planeID + " (" + this.capacity + " ppl) " + flight + "\n");
        }
        
        return planInfo; 
    }
    
    
    
}
