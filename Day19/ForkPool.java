import jdk.jfr.Threshold;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkPool {
    public static final int limit = 10;
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        long num = 1000000;
        int start = 1;
        long end = num;

        SumTask sumTask = new SumTask(start,end);
        long finalValue = forkJoinPool.invoke(sumTask);
        System.out.println("Sum :"+ finalValue);
    }
}

class SumTask extends RecursiveTask<Long> {

    private int start;
    private long end;

    SumTask(int start , long end){
        this.start =start;
        this.end = end;
    }

    @Override
    public Long compute() {
        if (end - start <= ForkPool.limit) {
            long sum = 0;
            for(int i = start ; i<=end ;i++){
                sum+=i;
            }
            return  sum;
        }
        else{
            int middle = (int) ((start+end)/2);
            SumTask left = new SumTask(start,middle);
            SumTask right =  new SumTask(middle+1,end);

            left.fork();
            right.fork();

            long leftfinal =   left.join();
            long rightfinal =  right.join();

            return leftfinal+rightfinal;
        }
    }
}
