package item80;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    ExecutorService executorService = Executors.newFixedThreadPool(3);

    executorService.execute(() -> {
      String threadName = Thread.currentThread().getName();
      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) { }
      System.out.println("job1: " + threadName);
    });
    executorService.execute(() -> {
      String threadName = Thread.currentThread().getName();
      try {
        Thread.sleep(4000);
      } catch (InterruptedException e) { }
      System.out.println("job2: " + threadName);
    });
    executorService.execute(() -> {
      String threadName = Thread.currentThread().getName();
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) { }
      System.out.println("job3: " + threadName);
    });
    executorService.execute(() -> {
      String threadName = Thread.currentThread().getName();
      try {
        Thread.sleep(6000);
      } catch (InterruptedException e) { }
      System.out.println("job4: " + threadName);
    });

    executorService.shutdown();
    if (!executorService.awaitTermination(3, TimeUnit.SECONDS)) {
      System.out.println("force shutdown");
      List<Runnable> runnables = executorService.shutdownNow();
    }

    System.out.println("End");
  }
}
