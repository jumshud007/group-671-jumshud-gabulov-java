package classwork_11;

public class BankAccount {
    String owner;
    int balance;
    int altacc;
    
    public void perevod(double amount) {balance -= amount; altacc += amount;}
    public void deposit(double amount) {balance += amount;}    
    public void withdraw(double amount) {balance -= amount;}    
    public void showBalance() {System.out.println("Owner :" + owner + "; Balance :" + balance);}    
}
