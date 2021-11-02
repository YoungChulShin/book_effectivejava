package item32;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> item1 = new ArrayList<>();
    item1.add("0");
    item1.add("1");
    item1.add("2");

    //VarArgs.dangerous(item1);

    VarArgs.toArray("1", "2", "3");

    String[] strings = VarArgs.pickTwo("1", "2", "3");
  }
}
