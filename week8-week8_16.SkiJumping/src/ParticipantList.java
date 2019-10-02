
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class ParticipantList {
    private List<Participant> participants = new ArrayList<Participant>();

    public ParticipantList() {
    }
    
    public void add(Participant participant){
        this.participants.add(participant);
    }
    
    public void printParticipant(){
        int counter = 1;
        sort();
        for(Participant participant : participants){
            System.out.println("  " + counter + "." + " " + participant.getName() + " (" + participant.getTotalPoints() + " points)");
            counter++;
        }
    }

    public void sort(){
        Collections.sort(this.participants);
    }
    
    public void printRoundResult(int counter){
        sort();
        for(Participant participant : participants){
            participant.setRoundJumpLength();
            participant.setJudgeVotes();
            participant.printRoundResult(participant, counter);
        }
    }
    
    public void updateTotalPoint(int counter){
        for(Participant participant : participants){
            participant.updateTotalPoint(counter);
        }
    }
    
    public void printFinalResult(){
        int counter = 1;
        for(Participant participant : participants){
            participant.printFinalResult(counter);
            counter++;
            System.out.println("");
        }
    }

}
