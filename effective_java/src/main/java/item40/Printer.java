package item40;

public interface Printer {

  default void printLog() {
    System.out.println("Printer log");
  }

}
