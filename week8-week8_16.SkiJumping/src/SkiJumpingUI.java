
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
public class SkiJumpingUI {
    String input = "marcus\n" + "martin\n" + "\n" + "jump\n" + "jump\n" + "\n";
    //Scanner scan = new Scanner(input);
    Scanner scan = new Scanner(System.in);
    private ParticipantList participants = new ParticipantList();
    
    public SkiJumpingUI() {
    }
    
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        addParticipants();
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        jumpOrQuit();
        
    }
    
    private void addParticipants(){
        while(true){
            System.out.print("  Participant name: ");
            String name = scan.nextLine();
            if(name.isEmpty()){
                break;
            }
            Participant participant = new Participant(name);
            this.participants.add(participant);
        }
    }
    
    private void jumpOrQuit(){
        String input;
        int roundCounter = 1;
        
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            input = scan.nextLine();
            if(!input.equals("jump")){
                break;
            }
            System.out.println("");
            round(roundCounter);
            participants.updateTotalPoint(roundCounter);
            roundCounter++;
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
        printFinalResult();
    }
    
    private void round(int roundCounter){
        System.out.println("Round " + roundCounter);
        System.out.println("");
        jumpingOrder();
        System.out.println("");
        roundResult(roundCounter);
    }
    
    private void jumpingOrder(){
        System.out.println("Jumping order: ");
        
        this.participants.printParticipant();
        
    }
    
    private void roundResult(int counter){
        System.out.println("Results of round " + counter);
        participants.printRoundResult(counter);
    }
    
    private void printFinalResult(){
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        participants.printFinalResult();
    }
    
    
}
