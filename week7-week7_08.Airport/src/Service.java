
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
public class Service {

    public Service() {
    }
    
    public void start(Scanner scan, FlightSchedule fs){
        String input = "";
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        
        do{
            System.out.println("Choose operation:"); 
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            input = scan.nextLine();
            
            if(input.equals("1")){
                printPlane(scan, fs);
            }else if(input.equals("2")){
                printFlights(scan, fs);
            }else if(input.equals("3")){
                printPlaneInfo(scan, fs);
            }else{
                System.out.println("Wrong selection");
            }
        }while(!input.equals("x"));
        
    }
    
    public static void printPlane(Scanner scan, FlightSchedule fs){
        fs.printAllPlanes();
    }
    
    public static void  printFlights(Scanner scan, FlightSchedule fs){
        fs.printAllFlight();
    }
    
    public static void printPlaneInfo(Scanner scan, FlightSchedule fs){
        String id;
        System.out.print("Give plane ID:");
        id = scan.nextLine();
        
        fs.showFlightSchedule(id).printAirplaneInfo();
    }
}
