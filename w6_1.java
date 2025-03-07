class work extends Thread{
    public void run(){
        System.out.println("Hello, World!");
    }
}
public class w6_1 {
    public static void main(String[] args) {
        work w = new work();
        w.start();
    }
} 