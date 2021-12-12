package item78;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

//  private static volatile boolean stopRequested;
//
//  private static synchronized void requestStop() {
//    stopRequested = true;
//  }
//
//  private static synchronized boolean stopRequested() {
//    return stopRequested;
//  }

  private static AtomicBoolean stopRequested = new AtomicBoolean();

  public static void main(String[] args) throws InterruptedException {
    Thread backgroundThread = new Thread(() -> {
      int i = 0;
      // 최적화 과정에서 아래와 같이 변경된다
//      if (stopRequested) {
//        while (true) {
//          i++;
//        }
//      }
      while (!stopRequested.get()) {
        i++;
      }
    });

    backgroundThread.start();

    TimeUnit.SECONDS.sleep(1);
    stopRequested.set(true);
    //requestStop();
  }
}
