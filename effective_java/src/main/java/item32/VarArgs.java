package item32;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class VarArgs {

  @SafeVarargs
  public static void dangerous(List<String>... stringLists) {
    List<Integer> initList = List.of(42);
    Object[] objects = stringLists;
    objects[0] = initList;
    String s = stringLists[0].get(0);
  }

  public static <T> T[] toArray(T... args) {
    return args;
  }

  public static <T> T[] pickTwo(T a, T b, T c) {
    switch (ThreadLocalRandom.current().nextInt(3)) {
      case 0: return toArray(a, b);
      case 1: return toArray(a, c);
      case 2: return toArray(b, c);
    }
    throw new AssertionError();
  }

  @SafeVarargs
  public static <T> List<T> flatten(List<? extends T>... lists) {
    List<T> result = new ArrayList<>();
    for (List<? extends T> list : lists) {
      result.addAll(list);
    }

    return result;
  }
  public static <T> List<T> flattenSafen(List<List<? extends T>> lists) {
    List<T> result = new ArrayList<>();
    for (List<? extends T> list : lists) {
      result.addAll(list);
    }

    return result;
  }
}
