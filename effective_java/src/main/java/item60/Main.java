package item60;

import java.math.BigDecimal;

public class Main {

  public static void main(String[] args) {
//    double a = 1.03;
//    double b = 0.42;
//    System.out.println(a - b);

    // double 사용
//    double funds = 1.00;
//    int itemsBought = 0;
//    for (double price = 0.0; funds > price; price += 0.10) {
//      funds -= price;
//      itemsBought++;
//    }
//
//    System.out.println(itemsBought + "개 구입");
//    System.out.println("잔돈(달러):" + funds);

    // big decimal

    final BigDecimal TEN_CENTS = new BigDecimal("0.10");
    BigDecimal funds = new BigDecimal("1.00");
    int itemsBought = 0;
    for (BigDecimal price = TEN_CENTS;
         funds.compareTo(price) >= 0;
         price = price.add(TEN_CENTS)) {
      funds = funds.subtract(price);
      itemsBought++;
    }

    System.out.println(itemsBought + "개 구입");
    System.out.println("잔돈(달러):" + funds);
  }

}
