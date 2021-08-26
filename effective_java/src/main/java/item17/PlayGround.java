package item17;

import item16.Time;
import java.util.Optional;

public class PlayGround {

  public static void main(String...args) {
    Time time = new Time(1, 3);

    String ss = Optional.ofNullable(time.getName()).orElse("ss");

    finalStringHashTest();
  }

  private static void finalHashTest() {

    Integer ten = Integer.valueOf(10);
    Integer ten2 = ten;

    if (ten.equals(ten2)) {
      System.out.println("Equal");
    }

    System.out.println(ten.hashCode());
    ten = 20;
    if (ten.equals(ten2)) {
      System.out.println("Equal");
    }

    System.out.println("ten2 : " + ten2);

    System.out.println(ten.hashCode());
    ten = 30;
    System.out.println(ten.hashCode());
    ten = 10;
    System.out.println(ten.hashCode());
  }

  private static void finalStringHashTest() {
    String a = "hi";
    String b = a;

    System.out.println("a == b : " + (a == b));

    a = "hihi";
    System.out.println("a == b : " + (a == b));

    b = "hihi";
    System.out.println("a == b : " + (a == b));
  }
}
