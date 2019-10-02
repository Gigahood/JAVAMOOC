
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
        Scanner scan = new Scanner(System.in);
        String input = "";
        Birdwatcher database = new Birdwatcher();
        
        do{
            System.out.print("? ");
            input = scan.nextLine();
            
            input = input.trim().toUpperCase();
            
            if(input.equals("ADD")){
                System.out.print("Name : ");
                String name = scan.nextLine();
                System.out.print("Latin Name : ");
                String lname = scan.nextLine();
                
                Bird newBird = new Bird(name,lname);
                database.addBird(newBird);
            }else if(input.equals("OBSERVATION")){
                System.out.print("What was observed:?");
                String bird = scan.nextLine();
                bird = bird.trim().toUpperCase();
                database.observation(bird);
            }else if(input.equals("STATISTICS")){
                database.statistics();
            }else if(input.equals("SHOW")){
                System.out.print("What? ");
                String name = scan.nextLine();
                database.show(name);
            }
            
            
        }while(! input.equals("QUIT"));
    
    
    }

}
