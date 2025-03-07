import java.util.Scanner;
public class w5_3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        scanner.close();
        int maxlength = 0, length = 0;
        int maxsum = 0, sum = 0;
        boolean odd = false;
        for(int num : a){
            if(num % 2 != 0){//odd case 
                odd = true;
                length++;
                sum += num;
            }else{
                if(length > maxlength){//updates the operation at every new even number at the end of odd sequence
                    maxlength = length;
                    maxsum = sum;
                }else if(length == maxlength){
                    maxsum += sum;
                }
                length = 0; // resets current counts
                sum = 0;
            }
        }
        if(length > maxlength){//to handle after array is traversed and last element is odd
            maxsum = sum;
        }else if(length == maxlength){
            maxsum += sum;
        }
        System.out.println(odd ? "Result: " + maxsum : "Result: -1");
    }
}
