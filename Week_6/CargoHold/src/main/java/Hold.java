/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekate
 */
import java.util.ArrayList;
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight=0;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public void addSuitcase(Suitcase suitcase){
        if(totalWeight + suitcase.totalWeight() <= maxWeight){
            this.suitcases.add(suitcase);
            totalWeight = totalWeight + suitcase.totalWeight();
        }  
    }
    public String toString(){
        
        if(this.suitcases.size()==0){
            return "no suitcases" + totalWeight+ " kg)";
        } else if (this.suitcases.size()==1){
            return   suitcases.size()+" suitcase (" + totalWeight+ " kg)";
        } else {
            return   suitcases.size()+" suitcases (" + totalWeight+ " kg)";
        }
        
    }
    public void printItems(){
        for(int i=0; i<suitcases.size();i++){
            suitcases.get(i).printItems();
        }
    }
}
