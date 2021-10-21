package item24;

class Calculator {

  private int value;
  private String valueString;

  public void calculate(Operation operation) {
    if (operation == Operation.PLUS) {
      System.out.println("Plus");
    } else if (operation == Operation.MINUS) {
      System.out.println("Minus");
    }
  }

  public enum Operation {
    PLUS, MINUS, DIV, MOD
  }

  public static class StaticOperation {

    public void innerCalculate() {

    }
  }
}
