import java.util.Scanner;
interface PaymentMethod {
    void processPayment(double amount);
}
class CreditCard implements PaymentMethod{
    String cardNumber;
    double balance = 10000;
    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public void processPayment(double amount){
        System.out.println("Balance before : "+balance);
        if(amount<balance){
            System.out.println("Processing payment in credit card of amount "+amount);
            System.out.println("From Card Number: "+cardNumber);
            balance=balance-amount;
            System.out.println("New Balance : "+balance);
        }
        else{
            System.out.println("Cannot process money,Balance not deducted!");
        }   
    }
}
class DebitCard implements PaymentMethod{
    String cardNumber;
    double balance = 10000;
    public DebitCard(String cardNumber){
        this.cardNumber = cardNumber;
    }
    public void processPayment(double amount){
        System.out.println("Balance before : "+balance);
        if(amount<balance){
            System.out.println("Processing payment in debit card of amount "+amount);
            System.out.println("From Card Number: "+cardNumber);
            balance=balance-amount;
            System.out.println("New Balance : "+balance);
        }
        else{
            System.out.println("Cannot process money,Balance not deducted!");
        }   
    }
}
class PayPal implements PaymentMethod{
    String email;
    double balance = 10000;
    public PayPal(String email){
        this.email = email;
    }
    public void processPayment(double amount){
        System.out.println("Balance before : "+balance);
        if(amount<balance){
            System.out.println("Processing payment in credit card of amount "+amount);
            System.out.println("From Paypal linked to email : "+email);
            balance=balance-amount;
            System.out.println("New Balance : "+balance);
        }
        else{
            System.out.println("Cannot process money,Balance not deducted!");
        }   
    }
}
public class w4_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Choice:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. PayPal");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:
                System.out.print("Enter credit card number: ");
                String creditCardNumber = scanner.nextLine();
                PaymentMethod creditCard = new CreditCard(creditCardNumber);
                creditCard.processPayment(1000);
                break;
            case 2:
                System.out.print("Enter debit card number: ");
                String debitCardNumber = scanner.nextLine();
                PaymentMethod debitCard = new DebitCard(debitCardNumber);
                debitCard.processPayment(1000);
                break;
            case 3:
                System.out.print("Enter PayPal email: ");
                String paypalEmail = scanner.nextLine();
                PaymentMethod paypal = new PayPal(paypalEmail);
                paypal.processPayment(1000);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        scanner.close();
    }
}
