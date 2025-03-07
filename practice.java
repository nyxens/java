class NumberPrinter{
    int num = 1;
    int limit = 10;
    public synchronized void Printodd(){
        while(num < limit){
            while(num % 2 ==0){
                try{
                    wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(num + " ");
            num++;
            notify();            
        }
    }
    public synchronized void Printeven(){
        while(num <= limit){
            while(num % 2 != 0){
                try{
                    wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println(num + " ");
            num++;
            notify();
        }
    }
}
class oddtask implements Runnable{
    NumberPrinter np;
    public oddtask(NumberPrinter np){
        this.np = np;
    }
    public void run(){
        np.Printodd();
    }
}
class eventask implements Runnable{
    NumberPrinter np;
    public eventask(NumberPrinter np){
        this.np = np;
    }
    public void run(){
        np.Printeven();
    }
}
public class practice {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        Thread t1 = new Thread(new oddtask(np));
        Thread t2 = new Thread(new eventask(np));
        t1.start();
        t2.start();
    }
} 