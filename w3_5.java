// abstract class BankAccount{
//     protected double balance;
//     public BankAccount(double balance){
//         this.balance = balance;
//     }
//     public abstract void deposit(double amount);
//     public abstract void withdraw(double amount);
//     public void displayBalance(){
//         System.out.println("Balance : "+balance);
//     }
// }
// final class SavingsAccount extends BankAccount{
//     double intrestrate;
//     public SavingsAccount(double balance,double intrestrate){
//         super(balance);
//         this.intrestrate = intrestrate;
//     }
//     public void deposit(double amount){
//         balance += amount;
//         balance += amount*(intrestrate/100);
//         System.out.println("Deposited with intrest!");
//     }
//     public void withdraw(double amount){
//         if(balance>=amount){
//             balance -= amount;
//             System.out.println("Withdrawn!");
//         }else{
//             System.out.println("Insufficient Funds!");
//         }
//     }
//     public void displayBalance(){
//         System.out.println("Saving Balance : "+balance);
//     }
// }
// class CheckingAccount extends BankAccount{
//     double overdraftLimit;
//     public CheckingAccount(double balance,double overdraftLimit){
//         super(balance);
//         this.overdraftLimit = overdraftLimit;
//     }
//     public CheckingAccount(double overdraftLimit){
//         this(0,overdraftLimit);
//     }
//     public void deposit(double amount){
//         balance += amount;
//         System.out.println("Deposited!");
//     }
//     public void withdraw(double amount){
//         if(balance-amount>=overdraftLimit){
//             balance -= amount;
//             System.out.println("Withdrawn!");
//         }else{
//             System.out.println("Amount exceeds Overdraft Limit!");
//         }
//     }
//     public void displayBalance(){
//         System.out.println("Checking Balance : "+balance);
//     }
// }
// public class w3_5 {
//     public static void main(String[] args) {
//         SavingsAccount sa = new SavingsAccount(1000, 5);
//         sa.deposit(1500);
//         sa.withdraw(500);
//         sa.displayBalance();
//         System.out.println(" ");
//         CheckingAccount ca = new CheckingAccount(1000,200);
//         ca.deposit(300);
//         ca.withdraw(600);
//         ca.displayBalance();
//     }
// }
