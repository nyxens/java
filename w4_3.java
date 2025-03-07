import java.util.Scanner;
interface Calculator{
    double add(double a,double b);
    double subtract(double a,double b);
    double multiply(double a,double b);
    double divide(double a,double b);
    double power(double base,double exponent);
    long factorial(int n);
}
class ScientificCalculator implements Calculator{
    public double add(double a,double b){
        return a+b;
    }
    public double subtract(double a,double b){
        return a-b;
    }
    public double multiply(double a,double b){
        return a*b;
    }
    public double divide(double a,double b){
        if (b==0) {
            return -1;
        }
        return a/b;
    }
    public double power(double base,double exponent){
        return Math.pow(base,exponent);
    }
    public long factorial(int n){
        if(n<0){
            return -1;
        }
        long result = 1;
        for(int i=1;i<=n;i++){
            result *= i;
        }
        return result;
    }
}
public class w4_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ScientificCalculator calculator = new ScientificCalculator();
        while(true){
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Factorial");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter first number: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b1 = scanner.nextDouble();
                    System.out.println("Result: "+calculator.add(a1,b1));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b2 = scanner.nextDouble();
                    System.out.println("Result: "+calculator.subtract(a2,b2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b3 = scanner.nextDouble();
                    System.out.println("Result: "+calculator.multiply(a3,b3));
                    break;
                case 4: 
                    System.out.print("Enter first number: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b4 = scanner.nextDouble();
                    if(calculator.divide(a4,b4)==-1){
                        System.out.println("Cannot divide by 0");
                        break;
                    }
                    System.out.println("Result: "+calculator.divide(a4,b4));
                    break;
                case 5: 
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: "+calculator.power(base,exponent));
                    break;
                case 6: 
                    System.out.print("Enter a number: ");
                    int n = scanner.nextInt();
                    if(calculator.factorial(n)==-1){
                        System.out.println("Input should be positive");
                        break;
                    }
                    System.out.println("Result: "+calculator.factorial(n));
                    break;
                case 7: 
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }
    }
}
