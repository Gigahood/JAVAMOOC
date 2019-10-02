
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
public class GradeDistribution {
    private int [][] grades;
    
    public GradeDistribution(){
        this.grades = new int[6][2];
        setGrade(6);
    }
    
    public void setGrade(int grade){
        for(int i = 0; i < grade; i++){
            this.grades[i][0] = i;
            this.grades[i][1] = 0;
        }
    }
    
    public void printGrade(ArrayList<Integer> numbers){
        ArrayList<Integer> newGrade = calculateGrade(numbers);
        calculateStar(this.grades, newGrade);
        
        System.out.println("Grade distribution : ");
        for(int i = 5 ; i >=0; i--){
            System.out.print(grades[i][0] + ": " );
            printStar(grades[i][1]);
            System.out.print("\n");
        }
        
    }
    
    private ArrayList<Integer> calculateGrade(ArrayList<Integer> numbers){
        ArrayList<Integer> newGrade = new ArrayList<Integer>();
        for(int number : numbers){
            if(number >= 50){
                newGrade.add(5);
            }else if(number >= 45){
                newGrade.add(4);
            }else if(number >= 40){
                newGrade.add(3);
            }else if(number >= 35){
                newGrade.add(2);
            }else if(number >= 30){
                newGrade.add(1);
            }else{
                newGrade.add(0);
            }
        }
        
        return newGrade;
    }
    
    private int[][] calculateStar(int[][] grades, ArrayList<Integer> newGrade){
        
        for(int number : newGrade){
            switch(number){
                case 0:
                    grades[0][1]++;
                    break;
                case 1:
                    grades[1][1]++;
                    break;
                case 2:
                    grades[2][1]++;
                    break;
                case 3:
                    grades[3][1]++;
                    break;
                case 4:
                    grades[4][1]++;
                    break;
                case 5:
                    grades[5][1]++;
                    break;
            }
        }
        
        return grades;
    }
    
    private void printStar(int number){
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
    }
    
    public double calculatePercentage(ArrayList<Integer> numbers){
        ArrayList<Integer> newGrade = calculateGrade(numbers);
        double acceptedScore = 0.00;
        
        for(int i = 0; i < newGrade.size(); i++){
            if(newGrade.get(i) > 0){
                acceptedScore++;
            }
            
        }
        
        return 100.00 * (acceptedScore / (double)numbers.size());
    }
    
}
