package mutlithreading.semophore;

import java.util.concurrent.Semaphore;

public class SemaphoreEX {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Zaur", callBox);
        new Person("Oleg", callBox);
        new Person("Viktor", callBox);
        new Person("Igor", callBox);
        new Person("Sanya", callBox);
        new Person("Petya", callBox);

    }


}

class Person extends Thread{
    String name;
    private Semaphore callBox;

    public Person(String name,Semaphore callBox){
        this.name=  name;
        this.callBox = callBox;
        this.start();
    }

    public void run(){
        try{
            System.out.println(name + " wait...");
            callBox.acquire();

            System.out.println((name + " use phone"));
            sleep(2000);
            System.out.println(name + " ends call");
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally{
            callBox.release();
        }
    }
}