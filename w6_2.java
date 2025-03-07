class Even extends Thread {
    public void run(){
        System.out.print("Even: ");
        for(int i=1;i<=20;i++){
            if(i%2==0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Odd extends Thread {
    public void run(){
        System.out.print("Odd: ");
        for(int i=1;i<=20;i++){
            if (i%2!=0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class w6_2{
    public static void main(String[] args) throws InterruptedException{
        Even e = new Even();
        Odd o = new Odd();
        e.start();
        e.join();
        o.start();
    }
} 