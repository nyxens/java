class sum implements Runnable{
    int start;
    int end;
    long sum;
    public sum(int start,int end){
        this.start = start;
        this.end = end;
        this.sum = 0;
    }
    public void run(){
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
    }
    public long getSum(){
        return sum;
    }
    private boolean isPrime(int num){
        if(num<=1)
            return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
} 
public class w6_4{
    public static void main(String[] args){
        int num = 10;
        Thread[] threads = new Thread[5];
        sum[] tasks = new sum[5];
        int range = num/5;
        for(int i=0;i<5;i++){
            int start = i*range+1;
            int end = (i==4) ? num : (i + 1)*range;
            tasks[i] = new sum(start,end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        long total=0;
        for(int i=0;i<5;i++){
            try{
                threads[i].join();
                total+=tasks[i].getSum();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Sum : "+total);
    }
} 