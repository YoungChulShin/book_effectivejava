package item74;

public class Print {

  /**
   * Exceptions<p>
   * IllegalArgumentException: if message is null, then throw
   * @throws Exception message가 null 이라면, 즉 ({@code message == null || message.length() == 0})이면 발생한다
   */
  public void printMessage(String message) throws Exception {
    if (message == null || message.length() == 0) {
      throw new Exception("message");
    }

    System.out.println(message);
  }

}
