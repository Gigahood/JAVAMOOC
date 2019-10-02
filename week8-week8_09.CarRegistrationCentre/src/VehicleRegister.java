
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
public class VehicleRegister {
    
    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
    
    public boolean add(RegistrationPlate plate, String owner){
        if(owners.containsKey(plate)){
            return false;
        }
        owners.put(plate, owner);
        
        return true;
    }
    
    public String get(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            return owners.get(plate);
        }
        
        return null;
    }
    
    public boolean delete(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        }
        
        return false;
    }
    
    public void printRegistrationPlates(){
        for(RegistrationPlate plate : owners.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owner = new ArrayList<String>();
        
        for(RegistrationPlate plate : owners.keySet()){
            if(!owner.contains(owners.get(plate))){
               owner.add(owners.get(plate)); 
            }
            
        }
        
        for(String ownerPrint : owner){
            System.out.println(ownerPrint);
        }
    }
    
    
}
