class numberprinter {
    int i=1;
    public synchronized void printeven(){
        while(i<=10){
            while(i%2!=0){
                try{wait();}
                catch(InterruptedException e){System.out.println(e);}
            }
            if(i<=10){
                System.out.println(i);
                i++;
                notifyAll();
            }
            
        }
    }
    public synchronized void printodd(){
        while(i<=10){
            while(i%2==0){
                try{wait();}
                catch(InterruptedException e){System.out.println(e);}
            }
            if(i<=10){
                System.out.println(i);
                i++;
                notifyAll();
            }
        }
    }
}
class oddtask implements Runnable{
    numberprinter np;
    public oddtask(numberprinter np){
        this.np = np;
    }
    public void run(){
        np.printodd();
    }
}
class eventask implements Runnable{
    numberprinter np;
    public eventask(numberprinter np){
        this.np = np;
    }
    public void run(){
        np.printeven();
    }
}
public class practice10 {
    public static void main(String[] args) {
        numberprinter np = new numberprinter();
        Thread t1 = new Thread(new oddtask(np));
        Thread t2 = new Thread(new eventask(np));
        t1.start();
        t2.start();
        // try {
        //     t1.join();
        //     t2.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    }
}
