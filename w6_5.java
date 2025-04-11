import java.util.Scanner;
public class w6_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter numerator: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("enter denominator: ");
            int b = Integer.parseInt(sc.nextLine());
            double c =(double) a / b;
            System.out.println("result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("finally block executed");
        }
        sc.close();
    }
}
