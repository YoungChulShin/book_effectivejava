package item54;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    Play play = new Play();
    List<Cheese> cheeses = play.getCheeses();

    cheeses.add(new Cheese());

    List<Cheese> cheesesInStock = play.cheesesInStock;

    List<Cheese> cheesesWithImmutableEmpty = play.getCheesesWithImmutableEmpty();
    cheesesWithImmutableEmpty.add(new Cheese());

    List<Cheese> cheesesWithImmutableEmpty1 = play.getCheesesWithImmutableEmpty();
  }

}
