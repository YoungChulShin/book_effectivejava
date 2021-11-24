package item56;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> words = new ArrayList<>();
    words.add("1");
    words.add("2");
    words.add("3");
    words.add("4");
    words.add("5");

//    for (String word : words) {
//      words.remove(word);
//    }

    words.removeIf(x -> x.equals("4"));
    words.stream().forEach(System.out::println);
  }
}
