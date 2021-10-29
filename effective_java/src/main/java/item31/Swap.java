package item31;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Swap {

  public static <E> void swap(List<E> list, int i, int j) {
    list.set(i, list.set(j, list.get(i)));
  }

  public static void swap2(List<?> list, int i, int j) {
    swap2Internal(list, i, j);
  }

  private static <E> void swap2Internal(List<E> list, int i, int j) {
    list.set(i, list.set(j, list.get(i)));
  }

  public static <E extends Comparable<? super E>> E max(Collection<E> c) {
    if (c.isEmpty()) {
      new IllegalArgumentException("컬렉션이 비어있습니다");
    }

    E result = null;
    for (E e: c) {
      if (result == null || e.compareTo(result) > 0) {
        result = Objects.requireNonNull(e);
      }
    }

    return result;
  }
}
