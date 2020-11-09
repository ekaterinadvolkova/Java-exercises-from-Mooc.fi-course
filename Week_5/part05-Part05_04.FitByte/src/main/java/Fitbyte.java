/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekate
 */
public class Fitbyte {
    private int age;
    private double restingheart;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age=age;
        this.restingheart=restingHeartRate;
    }
    
    public double maximumheartrate(){
        return 206.3 - (0.711 * age);
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return (maximumheartrate()-restingheart)*(percentageOfMaximum)+restingheart;
    }
    
}
