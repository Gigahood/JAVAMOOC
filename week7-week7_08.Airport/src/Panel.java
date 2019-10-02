
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Panel {
    private Service service = new Service();
    private FlightSchedule fs = new FlightSchedule();
    
    public Panel(){
        
    }
    
    public void start(Scanner scan){
        String choice = "";
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        do{
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            choice = scan.nextLine();
            
            if(choice.equals("1")){
                addPlane(scan);
            }else if(choice.equals("2")){
                addFlight(scan);
            }
            
        }while(!choice.equals("x"));
        
        service.start(scan, fs);
        
    }
    
    private void addPlane(Scanner scan){
        String id;
        int capacity;
        
        System.out.print("Give plane ID: ");
        id = scan.nextLine();
        System.out.print("Give plane capacity: ");
        capacity = Integer.parseInt(scan.nextLine());
        
        Airplane newplane = new Airplane(id,capacity);
        fs.addPlane(id, newplane);
    }
    
    private void addFlight(Scanner scan){
        String id;
        String departCode;
        String destCode;
        
        System.out.print("Give plane ID: ");
        id = scan.nextLine();
        System.out.print("Give departure airport code: ");
        departCode = scan.nextLine();
        System.out.print("Give destination airport code: ");
        destCode = scan.nextLine();
        
        Flight newFlight = new Flight(departCode, destCode);
        if(fs.showFlightSchedule(id) != null){
           fs.showFlightSchedule(id).addFlight(newFlight); 
        }else{
            System.out.println("No Such Plane");
        }
        
    }
    
}
