package item38;

public enum AbstractOperation {

  PLUS("+") {
    public double apply(double x, double y) {
      return x + y;
    }
  },
  MINUS("-") {
    public double apply(double x, double y) {
      return x - y;
    }
  },
  TIMES("*") {
    public double apply(double x, double y) {
      return x * y;
    }
  },
  DIVIDE("/") {
    public double apply(double x, double y) {
      return x / y;
    }
  };

  private final String symbol;

  AbstractOperation(String symbol) {
    this.symbol = symbol;
  }

  public abstract double apply(double x, double y);

}
