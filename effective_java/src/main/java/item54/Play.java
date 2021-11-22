package item54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Play {

  public final List<Cheese> cheesesInStock = new ArrayList<>();
  private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

  public List<Cheese> getCheeses() {
    // 새로운 ArrayList를 만들어서 전달한다
    return new ArrayList<>(cheesesInStock);
  }

  public List<Cheese> getCheesesWithImmutableEmpty() {
    return Collections.emptyList();
  }

  public Cheese[] getCheesesArray() {
    return cheesesInStock.toArray(new Cheese[0]);
  }

  public Cheese[] getCheesesArrayWithPreDefined() {
    return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
  }
}
