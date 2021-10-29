package item31;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

public class Main {

  public static void main(String[] args) {
    MyWildStack<Number> stack = new MyWildStack<>();

    List<Integer> integers = List.of(1, 2, 3, 4, 5);
    stack.pushAll(integers);

    List<Object> reverseStack = new ArrayList<>();
    stack.popAll(reverseStack);
    stack.popAll(reverseStack);

    Integer max = Swap.max(integers);

    List<ScheduledFuture<?>> scheduledFutures = new ArrayList<>();
    Swap.max(scheduledFutures);
  }
}
