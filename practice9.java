import java.util.*;
class bank{
    double balance = 0;
    public synchronized void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
}
class user extends Thread{
    bank b;
    double amount;
    public user(bank b,double amount){
        this.b = b;
        this.amount = amount;
    }
    public void run(){
        b.deposit(amount);
    }
}
public class practice9 {
    public static void main(String[] args) throws Exception {
        bank b = new bank();
        user u1 = new user(b,1000);
        user u2 = new user(b,2000);
        user u3 = new user(b,3000);
        u1.start();
        u2.start();
        u3.start();
        u1.join();
        u2.join();
        u3.join();
        System.out.println("Final Balance: " + b.balance);
    }
}
