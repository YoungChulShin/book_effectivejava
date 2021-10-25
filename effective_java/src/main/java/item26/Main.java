package item26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    List unSafeStrings = new ArrayList();
    unSafeStrings.add("hihi");
    unSafeStrings.add(1234);

    List<String> strings = new ArrayList<>();
    unsafeAdd(strings, 42);
    unsafeAdd(strings, "hi");
    String firstItem = strings.get(0);

    Set<?> wildCardSet = new HashSet<>();
    wildCardSet.add(null);
  }

  private static void unsafeAdd(List list, Object o) {
    list.add(o);
  }

  private static int numElementsInCommon(Set<?> s1, Set<?> s2) {
    int result = 0;
    for (Object o1 : s1) {
      if (s2.contains(o1)) {
        result++;
      }
    }
    return result;
  }
}
