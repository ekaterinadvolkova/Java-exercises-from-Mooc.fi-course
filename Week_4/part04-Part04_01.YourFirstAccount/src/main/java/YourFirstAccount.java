
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account Account = new Account("Account", 100.00);
        
        System.out.println("Intial state");
        System.out.println(Account);
       
        Account.deposit(20);
        System.out.println("The balance of account is now: " + Account);
        
        System.out.println("End state");
        System.out.println(Account);
    }
}
