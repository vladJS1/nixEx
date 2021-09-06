package mutlithreading.callable;

import java.util.concurrent.*;

public class CallableFactorial {

    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Factorial1 factorial1 = new Factorial1(0 );

        Future<Integer> future = executorService.submit(factorial1);

        try {
            System.out.println(future.isDone());
            System.out.println("Want receive result");
            factorialResult = future.get();
            System.out.println("RECEIVE result");
            System.out.println(future.isDone());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally{
            executorService.shutdown();
        }
    }
}


class Factorial1 implements Callable<Integer>{
    int f;

    public Factorial1(int f){
        this.f = f;
    }
    @Override
    public Integer call() throws Exception {
        if(f<=0){
            throw new Exception("You input incorrect number");
        }
        int result = 1;
        for (int i = 1; i <= f ; i++) {
           result *=i;
           Thread.sleep(1000);
        }
        return result;
    }
}