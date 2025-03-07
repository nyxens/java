import java.util.Scanner;
public class w5_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        scanner.close();
        int min=a[0];
        for(int num:a){//refreshes min value
            if(num<min){
                min=num;
            }
        }
        System.out.print("Result: ");
        for(int i=0;i<n;i++){
            a[i]=(a[i]-min)*min; //operation
            System.out.print(a[i] + " ");
        }
    }
}
