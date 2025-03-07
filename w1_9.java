// import java.util.Scanner;
// public class w1_9 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int input,money=0;
//         do{
//             System.out.println("***********Menu************");
//             System.out.println("1.    Deposit money");
//             System.out.println("2.    Withdraw money");
//             System.out.println("3.    Check balance");
//             System.out.println("4.        Exit");
//             System.out.println("***************************");
//             System.out.print("choose your option :");
//             input = scanner.nextInt();
//             switch (input) {
//                 case 1:
//                     System.out.print("Enter amount to be deposited :");
//                     int plus = scanner.nextInt();
//                     if(plus>0){
//                     money += plus;
//                     System.out.println("money deposited!");
//                     }
//                     else
//                         System.out.println("try again!");
//                     break;
//                 case 2:
//                     System.out.print("Enter amout for withdrawal :");
//                     int sub = scanner.nextInt();
//                     if((money-sub)>0) {
//                     money -= sub;
//                     System.out.println("money withdrawn!");
//                     }
//                     else
//                         System.out.println("try again!");
//                     break;
//                 case 3:
//                     System.out.println("Balance : "+money);
//                     break;
//                 case 4:
//                     System.out.println("Exiting...");
//                     break;
//                 default:
//                     break;}
//             System.out.println();
//         }while (input !=4);
//         scanner.close();
//     }
// }
