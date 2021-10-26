package item27;

import java.util.Arrays;

public class Item27 {

  private final int size = 10;

  public <T> T[] toArray(T[] a) {
    T[] elements = null;
    if (a.length < size) {
      @SuppressWarnings("unchecked")
      T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
      return result;
    }
    return null;
  }

}
