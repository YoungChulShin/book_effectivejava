package item24;

import item24.Calculator.Operation;

public class NonStaticCalculator {

  private int value;
  private String valueString;

  public void calculate(String operation) {
    if (operation.equals("plus")) {
      System.out.println("Plus");
    } else if (operation.equals("minus")) {
      System.out.println("Minus");
    }
  }

  public class NonStaticOperation {

    public void innerCalculate() {
      NonStaticCalculator.this.calculate("plus");
      NonStaticCalculator.this.value = 4;
    }
  }
}
