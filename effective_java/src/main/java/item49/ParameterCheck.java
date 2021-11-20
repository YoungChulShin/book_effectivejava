package item49;

import java.math.BigInteger;
import java.util.Objects;

public class ParameterCheck {

  /**
   *
   * @param m
   * @return 현재 값 mode m
   * @throws ArithmeticException m이 0보다 작거나 같으면 발생한다
   */
  public BigInteger mod(BigInteger m) {
    if (m.signum() <= 0) {
      throw new ArithmeticException("계수는 양수여야 합니다");
    }

    return m;
  }

  public void printMessage(String message) {
    //message = Objects.requireNonNull(message, "Message는 null일 수 없습니다");

    pritn(message);
    System.out.println(message);
  }

  private void pritn(String message) {
    assert message != null;

    System.out.println("Completed");
  }
}
