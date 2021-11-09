package item40;

public class Main {

  public static void main(String[] args) {
    Bigram bigram = new Bigram();
    Bigram bigram2 = new Bigram();
    bigram.equals(bigram2);
    bigram.printLog();

    System.out.println(bigram);

    DefaultPrinter defaultPrinter =new DefaultPrinter();
    defaultPrinter.printLog();
  }
}
