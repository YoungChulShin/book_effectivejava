package item73;

public class Main {

  public static void main(String[] args) {

    try {
      throw new RuntimeException("hihi");
    } catch (Exception ex) {
      System.out.println(ex);
      System.out.println(ex.getMessage());
      System.out.println(ex.getStackTrace());
    }

    try {
      throw new MyException("internal server error", "501");
    } catch (Exception ex) {
      System.out.println(ex);
      System.out.println(ex.getMessage());
    }
  }
}
