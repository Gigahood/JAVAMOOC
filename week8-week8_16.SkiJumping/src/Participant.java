
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Participant implements Comparable<Participant>{
    private String name;
    private List<Integer> jumpLength = new ArrayList<Integer>();
    private int totalPoints;
    private int [] judgeVotes;

    public Participant() {
    }

    public Participant(String name) {
        this.name = name;
        this.totalPoints = 0;
        this.judgeVotes = new int[5];
    }
    
    public Participant(String name, int totalPoints) {
        this.name = name;
        this.totalPoints = totalPoints;
        this.judgeVotes = new int[5];
    }

    public String getName() {
        return name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }
    
    public void printRoundResult(Participant participant, int counter){
        System.out.println("  " + participant.name);
        System.out.println("    length: " + this.jumpLength.get(counter - 1));
        System.out.print("    judge votes: [");
        for(int i = 0; i < judgeVotes.length; i++){
            if(i == judgeVotes.length - 1){
                System.out.print(" " + judgeVotes[i] + ")");
            }else if(i == 0){
                System.out.print(judgeVotes[i] + ",");
            }else{
                System.out.print(" " + judgeVotes[i] + ",");
            }
        }
        System.out.println("");
    }
    
    public void setRoundJumpLength(){
        int length = RandomNumber.randomNumber(120, 60);
        this.jumpLength.add(length);
    }
    
    public void setJudgeVotes(){
        for(int i = 0; i < this.judgeVotes.length; i++){
            this.judgeVotes[i] = RandomNumber.randomNumber(20, 10);
        }
    }
    
    public void updateTotalPoint(int counter){
        this.totalPoints += (this.jumpLength.get(counter - 1) + calculateTotalJudgeVotes());
    }
    
    private int calculateTotalJudgeVotes(){
        Arrays.sort(judgeVotes);
        return (judgeVotes[1] + judgeVotes[2] + judgeVotes[3]);
    }
    
    public void printFinalResult(int counter){
        System.out.print(counter);
        System.out.println("           " + this.name + " (" + this.totalPoints + " points)");
        System.out.print("            jump lengths:");
        for(int i = 0; i < jumpLength.size(); i++){
            if(jumpLength.size() == 1){
                System.out.print(" " + jumpLength.get(i) + " m");
            }else{
                if(i != jumpLength.size() - 1){
                System.out.print(" " + jumpLength.get(i) + " m,");
            }else{
                System.out.print(" " + jumpLength.get(i) + " m");
            }
            }
        }
        //System.out.println("");
    }

    @Override
    public int compareTo(Participant o) {
        return this.totalPoints - o.totalPoints;
    }
    
    
    
    
}
