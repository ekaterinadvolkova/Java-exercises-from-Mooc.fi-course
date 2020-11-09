/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekate
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance=openingBalance;
    }

    public String toString() {
        // write code here
        return "The card has a balance of "+ balance+" euros";
    }
    public void eatAffordably() {
        if (this.balance>=2.60) {
            this.balance=this.balance-2.60;
        } 
       
    }

    public void eatHeartily() {
        if (this.balance>=4.60) {
            this.balance=this.balance-4.60;
        }
    }
    
    public void addMoney(double amount) {
        if (amount<0) {
            this.balance=this.balance+0;
        } else {
            this.balance=this.balance+amount;
        }
        
        if (this.balance>150.0) {
            this.balance=150.0;
        }
    }
    
}
