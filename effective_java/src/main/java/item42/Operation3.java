package item42;

import java.util.function.DoubleBinaryOperator;

public enum Operation3 {

  PLUS("+", (x, y) -> x + y),
  MINUS("-", (x, y) -> x - y),
  TIMES("*", (x, y) -> x * y),
  DIVIDE("/", (x, y) -> x / y);

  private final String symbol;
  private final DoubleBinaryOperator operator;

  Operation3(String symbol, DoubleBinaryOperator operator) {
    this.symbol = symbol;
    this.operator = operator;
  }

  public double apply(double x, double y) {
    return operator.applyAsDouble(x, y);
  }

}
