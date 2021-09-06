package com.example;

import com.example.schedule.CustomTask;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
      Queue<String> names = new LinkedList<>();
        names.add("Igor");
        names.add("Maria");
        names.add("Kiril");


        System.out.println(names.add(names.poll()));
        System.out.println(names.poll());
        System.out.println(names.poll());

        names.forEach(System.out::println);

    }
  public void runTask() {

    Calendar calendar = Calendar.getInstance();
    calendar.set(
            Calendar.DAY_OF_WEEK,
            Calendar.SUNDAY
    );
    calendar.set(Calendar.HOUR_OF_DAY, 22);
    calendar.set(Calendar.MINUTE, 45);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);


    Timer time = new Timer(); // Instantiate Timer Object

    // Start running the task on Monday at 15:40:00, period is set to 8 hours
    // if you want to run the task immediately, set the 2nd parameter to 0
    time.schedule(new CustomTask(), calendar.getTime(), TimeUnit.HOURS.toMillis(8));
  }
}
