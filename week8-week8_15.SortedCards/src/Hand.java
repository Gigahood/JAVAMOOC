
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards = new ArrayList<Card>();
    
    public void add(Card card){
         this.cards.add(card);
    }
     
    public void print(){
        String suit;
        String value;
        
        
         for(Card card : cards){
//             value = getValue(card.getValue());
//             suit = getSuit(card.getSuit());
             //System.out.println(value + " of " + suit);
             System.out.println(card);
         }
    }
    
    private String getValue(int value){
        switch(value){
            case 11 :
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            case 14:
                return "A";
            default:
                return Integer.toString(value);
        }
    }
    
    private String getSuit(int suit){
        switch(suit){
            case 0:
                return "Spades";
            case 1:
                return "Diamond";
            case 2:
                return "Hearts";
            case 3:
                return "Clubs";
            default:
                return "Error";
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand o) {
       int currentSum = calculateSumOfHand(this.cards);
       int comparedSum = calculateSumOfHand(o.cards);
       
       return currentSum - comparedSum;
    }
    
    private int calculateSumOfHand(ArrayList<Card> cards){
        int sum = 0;
        
        for(Card card : cards){
            sum += card.getValue();
        }
        
        return sum;
    }
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(cards, suitSorter );
    }
}

//public class Hand implements Comparable <Hand>{
//
//    private final List<Card> hand;
//
//    public Hand() {
//        this.hand = new ArrayList<Card>();
//    }
//
//    //this method adds card to the arraylist hand
//    public void add(Card card) {
//        this.hand.add(card);
//    }
//
//    //this method prints out the card
//    public void print() {
//        for (Card card : this.hand) {
//            System.out.println(card);
//        }
//    }
//
//    public void sort() {
//        Collections.sort(this.hand);
//    }
//
//    
//    @Override
//    public int compareTo(Hand hh){
//        int sum1 = 0;
//        for (Card card : hh.hand){
//            sum1 += card.getValue();
//        }
//        
//        int sum2 = 0;
//        for (Card card : this.hand){
//            sum2 += card.getValue();
//        }
//        
//        return sum2 - sum1;
//    }
//    
//    public void sortAgainstSuit(){
//        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
//         Collections.sort(this.hand, suitSorter);
//    }
//}