package item45;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CardDeck {

  private List<String> suitList = new ArrayList<>();
  private List<String> rankList = new ArrayList<>();

  private List<Card> newDeck() {
    List<Card> result = new ArrayList<>();
    for (String suit : suitList) {
      for (String rank : rankList) {
        result.add(new Card(suit, rank));
      }
    }

    return result;
  }

  private List<Card> newDeckStream() {
    return this.suitList.stream()
        .flatMap(suit ->
            rankList.stream()
                .map(rank -> new Card(suit, rank)))
        .collect(Collectors.toList());
  }
}
