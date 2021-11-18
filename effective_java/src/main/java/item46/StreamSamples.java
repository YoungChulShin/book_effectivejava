package item46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSamples {

  public void badCase1(File file) throws FileNotFoundException {
    Map<String, Long> freq = new HashMap<>();
    try (Stream<String> words = new Scanner(file).tokens()) {
      words.forEach(word -> freq.merge(word.toLowerCase(), 1L, Long::sum));
    }
  }

  public void goodCase1(File file) throws FileNotFoundException {
    Map<String, Long> freq;
    try (Stream<String> words = new Scanner(file).tokens()) {
      freq = words.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
    }
  }

  public void reverse() {
    Map<String, Long> freq = new HashMap<>();

    freq.keySet().stream()
        .sorted(Comparator.comparing(freq::get).reversed())
        .limit(10)
        .collect(Collectors.toList());
  }

  private void map() {
    Map<String, Planet> collect = Stream.of(Planet.values())
        .collect(Collectors.toMap(Object::toString, x -> x));
  }

  private void grouping() {
    List<String> words = new ArrayList<>();
    words.add("1");
    words.add("2");
    words.add("3");
    words.add("4");
    words.add("5");

    Map<String, Long> collect = words.stream().collect(
        Collectors.groupingBy(x -> x, Collectors.counting()));

  }


}
