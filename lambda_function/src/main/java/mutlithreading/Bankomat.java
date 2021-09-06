package mutlithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {


    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Zaur",lock);
        new Employee("Oleg",lock);
        new Employee("Elena",lock);
        new Employee("Viktor",lock);
        new Employee("Marina",lock);
        new Employee("Igor",lock);
    }

}

class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name,Lock lock){
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " wait... ");
//            lock.lock();
                System.out.println(name + " use bankomat");
                Thread.sleep(200);
                System.out.println(name + " ends self-work");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }else  {
            System.out.println(name + "  won`t wait...");
        }
    }
}
