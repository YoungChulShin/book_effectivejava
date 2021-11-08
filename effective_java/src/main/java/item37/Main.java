package item37;

import item37.Plant.LifeCycle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    List<Plant> garden = new ArrayList<>();
    garden.add(new Plant("1", LifeCycle.ANUAL));
    garden.add(new Plant("2", LifeCycle.ANUAL));
    garden.add(new Plant("3", LifeCycle.PERENNITAL));
    garden.add(new Plant("4", LifeCycle.BIENNIAL));
    garden.add(new Plant("5", LifeCycle.BIENNIAL));

//    Set<Plant>[] plantsByLifecCycle = (Set<Plant>[])new Set[LifeCycle.values().length];
//
//    for (int i = 0; i < plantsByLifecCycle.length; i++) {
//      plantsByLifecCycle[i] = new HashSet<>();
//    }
//
//    for (Plant p: garden) {
//      plantsByLifecCycle[p.lifeCycle.ordinal()].add(p);
//    }
//
//    for (int i = 0; i < plantsByLifecCycle.length; i++) {
//      System.out.printf("%s: %s%n",
//          Plant.LifeCycle.values()[i],
//          plantsByLifecCycle[i]);
//    }

    Map<LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);
    for (Plant.LifeCycle lc : Plant.LifeCycle.values()) {
      plantsByLifeCycle.put(lc, new HashSet<>());
    }
    for (Plant p : garden) {
      plantsByLifeCycle.get(p.lifeCycle).add(p);
    }

    System.out.println(plantsByLifeCycle);

    Map<LifeCycle, List<Plant>> collect = garden.stream()
        .collect(Collectors.groupingBy(x -> x.lifeCycle));
    System.out.println(garden.stream().collect(Collectors.groupingBy(x -> x.lifeCycle)));
    EnumMap<LifeCycle, Set<Plant>> collect1 = garden.stream().collect(Collectors
        .groupingBy(x -> x.lifeCycle, () -> new EnumMap<>(LifeCycle.class), Collectors.toSet()));
    System.out.println(garden.stream().collect(Collectors.groupingBy(x -> x.lifeCycle, () -> new EnumMap<>(LifeCycle.class), Collectors.toSet())));
  }
}
