package mutlithreading.situation;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }

}
class Thread10 extends Thread{

    public void run() {
        System.out.println("Thread 10: Try capture monitor lock2");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread 10: monitor object lock2 captured");

            System.out.println("Thread 10:Try capture monitor lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread 10: monitors objects lock1 and lock2 captured");

            }
        }
    }
}

class Thread20 extends Thread{

    public void run() {
        System.out.println("Thread 20: Try capture monitor lock1");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread 20: monitor object lock1 captured");

            System.out.println("Thread 20: Try capture monitor lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Thread 20: monitors objects lock1 and lock2 captured");

            }
        }
    }
}
