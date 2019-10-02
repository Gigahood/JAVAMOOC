/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Main {
     public static void main(String[] args) {
       Box laatikko = new Box(10); laatikko.add( new Book("Horstman", "Core Java",5) );
       laatikko.add( new Book("Beck", "Test Driven Development",0.5) );
       laatikko.add( new Book("Nietzsche", "Also spracht Zarahustra",1000) );
       laatikko.weight();
       
       Box box2 = new Box(100);
       box2.add(laatikko);
       box2.add(box2);

        System.out.println(box2);
    }
}
