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
      // 바깥 클래스의 private 변수에 접근할 수 있다
      Calculator calculator = new Calculator();
      calculator.value = 4;
    }
  }
}
