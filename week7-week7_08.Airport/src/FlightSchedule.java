
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class FlightSchedule {
    private HashMap<String, Airplane> airplanes = new HashMap<String, Airplane>();

    public FlightSchedule() {
    }
    
    public void addPlane(String id, Airplane plane){
        if(!id.isEmpty()){
            airplanes.put(id, plane);
        }
    }
    
    public void printAllPlanes(){
        for(Airplane plane : this.airplanes.values()){
            plane.printAirplaneInfo();
        }
    }
    
    public ArrayList<Airplane> getAllPlanes(){
        return new ArrayList<Airplane> (this.airplanes.values());
    }
    
    public void printAllFlight(){
        for(Airplane plane : this.airplanes.values()){
            System.out.println(plane);
        }
    }
    
    public Airplane showFlightSchedule(String id){
        if(this.airplanes.containsKey(id)){
            return this.airplanes.get(id);
        }else{
            return null;
        }
    }
}
