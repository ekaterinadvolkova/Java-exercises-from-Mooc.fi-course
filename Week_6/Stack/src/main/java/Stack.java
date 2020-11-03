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

public class Stack {
    
    private ArrayList <String> stacks;

    public Stack() {
        this.stacks = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(stacks.isEmpty()){
            return true;
        }
        return false;
        
    }
            
    public void add(String value){
        if(!this.stacks.contains(value)){
            this.stacks.add(value); 
        }
    }
    
    public ArrayList<String> values(){
        return stacks;
    }
    
    public String take(){
        return stacks.remove(stacks.size()-1);
    }
    
}
