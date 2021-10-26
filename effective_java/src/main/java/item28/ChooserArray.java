package item28;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooserArray {

  private final Object[] choiceArray;

  public ChooserArray(Collection choices) {
    choiceArray = choices.toArray();
  }

  public Object choose() {
    Random random = ThreadLocalRandom.current();
    return choiceArray[random.nextInt(choiceArray.length)];
  }

}
