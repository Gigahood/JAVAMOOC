/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kueky
 */
public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double wieght) {
        this.writer = writer;
        this.name = name;
        this.weight = wieght;
    }

    @Override
    public String toString() {
       return this.writer + ": " + this.name;
    }
    
    
    
    
    @Override
    public double weight() {
       return this.weight;
    }
    
}
