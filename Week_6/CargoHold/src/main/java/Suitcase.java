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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight=0;
    

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight=maxWeight;
    }
    public void addItem(Item item){
        //count total weight of the suit
        if(totalWeight + item.getWeight() <= maxWeight){
            this.items.add(item);
            totalWeight = totalWeight + item.getWeight();
        }        
    }
    public String toString(){
        if(this.items.size()==0){
            return "no items" + totalWeight+ " kg)";
        } else if (this.items.size()==1){
            return   items.size()+" item (" + totalWeight+ " kg)";
        } else {
            return   items.size()+" items (" + totalWeight+ " kg)";
        }
       
    }
    public void printItems () {
        for(int i=0; i<items.size();i++){
            System.out.println(items.get(i).getName()+" ("+items.get(i).getWeight() + " kg)");
        }
    
    }
    public int totalWeight (){
        return this.totalWeight;
    }
    public Item heaviestItem(){
        if (this.items.isEmpty()) {
            return null;
        }
        // create an object reference for the object to be returned
        // its first value is the first object on the list
        Item returnObject = this.items.get(0);

    // go through the list
        for (Item prs: this.items) {
        // compare each object on the list
        // to the returnObject -- we compare heights
        // since we're searching for the tallest,

            if (returnObject.getWeight() < prs.getWeight()) {
                // if we find a heavier item in the comparison,
                // we assign it as the value of the returnObject
                returnObject = prs;
            }
        }
        return returnObject;
    }
            
}
