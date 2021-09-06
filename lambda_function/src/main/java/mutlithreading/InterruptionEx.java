package mutlithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");

        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();

        System.out.println("main ends");

    }
}


class InterruptedThread extends Thread{
    double  sqrtSum=0;
    public void run(){
        for (int i = 0; i < 1000000000; i++) {
            if(isInterrupted()){
                System.out.println("Thread want interrupt");
                return;
            }
            sqrtSum+=Math.sqrt(i);
        }
        try{
            sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Thread want stop over sleep. Let`s stop thread");
            System.out.println(sqrtSum);
        }
        System.out.println(sqrtSum);
    }
}