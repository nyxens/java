class multiply extends Thread{
    int row;
    int[][] A, B, C;
    public multiply(int row,int[][] A,int[][] B,int[][] C){
        this.row = row;
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public void run(){
        for(int j=0;j<3;j++){
            C[row][j] = 0;
            for(int k=0;k<3;k++){
                C[row][j]+=A[row][k]*B[k][j];
            }
        }
    }
}
public class w6_3{
    public static void main(String[] args){
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] B = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};
        int[][] C = new int[3][3];
        Thread[] threads = new Thread[3];
        for(int i=0;i<3;i++){
            threads[i] = new multiply(i, A, B, C);
            threads[i].start();
        }
        for(int i=0;i<3;i++){
            try{
                threads[i].join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Result:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
} 