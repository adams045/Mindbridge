import java.util.concurrent.*;
class FactorialTask implements Callable<Long> {
    private final int number;
    public FactorialTask(int number) {
        this.number = number;
    }
    @Override
    public Long call() throws Exception {
        return calculateFactorial(number);
    }
    private Long calculateFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}

public class FactorialWithCallable {
    public static void main(String[] args) {
        int number = 10;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialTask task = new FactorialTask(number);
        Future<Long> future = executorService.submit(task);
        try {
            Long factorial = future.get();
            System.out.println("The factorial of " + number + " is: " + factorial);
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error occurred while calculating factorial: " + e.getMessage());
        }
    }
}
