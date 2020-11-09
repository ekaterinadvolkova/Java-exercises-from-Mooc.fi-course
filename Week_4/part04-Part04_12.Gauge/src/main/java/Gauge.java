/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekate
 */
public class Gauge {
    private int value;
    
    public void increase() {
        if(value<5) {
        value=value+1;   
        }
        
    }
    
    public void decrease() {
        if(value>1) {
            value=value-1;
        }
    }
    
    public int value() {
        return value;
    }
    
    public boolean full() {
        if (value==5) {
            return true;
        } else {
            return false;
        }
    }
}
