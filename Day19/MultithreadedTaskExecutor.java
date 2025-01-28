import java.util.concurrent.*;
class PrintNumbersTask implements Runnable {
    private final int taskId;
    public PrintNumbersTask(int taskId) {
        this.taskId = taskId;
    }
    @Override
    public void run() {
        System.out.println("Task " + taskId + " is being executed by thread: " + Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println("Task " + taskId + ": " + i);
        }
    }
}
public class MultithreadedTaskExecutor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            executorService.submit(new PrintNumbersTask(i));
        }
        executorService.shutdown();
    }
}
