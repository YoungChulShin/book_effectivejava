package item28;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserArrayGeneric<T> {

  private final T[] choiceArray;

  @SuppressWarnings("unchecked")
  public ChooserArrayGeneric(Collection<T> choices) {
    choiceArray = (T[])choices.toArray();
  }

  public T choose() {
    Random random = ThreadLocalRandom.current();
    return choiceArray[random.nextInt(choiceArray.length)];
  }
}
