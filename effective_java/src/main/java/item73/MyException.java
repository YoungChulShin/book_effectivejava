package item73;

public class MyException extends RuntimeException {

  String message;
  String code;

  public MyException(String message, String code) {
    super(message);
    this.message = message;
    this.code = code;
  }

  @Override
  public String toString() {
    return "Error Info - Code: " + code + ", Message: " + message;
  }
}
