class item {
    int item;
    boolean setvalue = false;
    public synchronized void setitem(int value){
        while(setvalue){
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.item = value;
        setvalue= true;
        System.out.println("Produced:" + value);
        notify();
    }    
    public synchronized int getitem(){
        while(!setvalue){
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        setvalue = false;
        System.out.println("consumed:" + item);
        notify();
        return item;
    }
}
class Producer implements Runnable{
    item i;
    public Producer(item i){
        this.i = i;
    }
    public void run(){
        int t = 0;
        while(true){
            i.setitem(t++);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class Consumer implements Runnable{
    item i;
    public Consumer(item i){
        this.i = i;
    }
    public void run(){
        while(true){
            i.getitem();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class practice2{
    public static void main(String[] args) {
        item i = new item();
        Producer p = new Producer(i);
        Consumer c = new Consumer(i);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }
}