package item55;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;

public class Main {

  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    String lastWordInLexicon = maxOptional(words).orElse("값이 없음");
    String lastWordInLexicon2 = maxOptional(words).orElse("답이 없음");

    maxOptional(words).map(x -> "Map" + x).orElse("값이 없음");

    OptionalInt a = OptionalInt.of(3);
  }

  public static <E extends Comparable<E>> E max(Collection<E> c) {
    if (c.isEmpty()) {
      throw new IllegalArgumentException("빈 컬렉션");
    }

    E result = null;
    for (E e : c) {
      if (result == null || e.compareTo(result) > 0) {
        result = Objects.requireNonNull(e);
      }
    }

    return result;
  }

  public static <E extends Comparable<E>> Optional<E> maxOptional(Collection<E> c) {
    if (c.isEmpty()) {
      return Optional.empty();
    }

    E result = null;
    for (E e : c) {
      if (result == null || e.compareTo(result) > 0) {
        result = Objects.requireNonNull(e);
      }
    }

    return Optional.of(result);
  }

  public static <E extends Comparable<E>> Optional<E> maxStream(Collection<E> c) {
    return c.stream().max(Comparator.naturalOrder());
  }
}
