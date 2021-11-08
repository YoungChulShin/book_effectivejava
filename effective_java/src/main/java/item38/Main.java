package item38;

import java.util.Arrays;
import java.util.Collection;

public class Main {

  public static void main(String[] args) {
    Operation operation = BasicOperation.PLUS;
    Operation expOperation = ExtendedOperation.EXP;

    test(BasicOperation.class, 1, 2);
    test2(Arrays.asList(ExtendedOperation.values()), 1, 2);
    test3(BasicOperation.PLUS, 1, 2);
  }

  private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
    for (Operation op : opEnumType.getEnumConstants()) {
      op.apply(x, y);
    }
  }

  private static  void test2(Collection<? extends Operation> opEnumType, double x, double y) {
    for (Operation op : opEnumType) {
      op.apply(x, y);
    }
  }

  private static  void test3(Operation operation, double x, double y) {
    operation.apply(x, y);
  }

}
