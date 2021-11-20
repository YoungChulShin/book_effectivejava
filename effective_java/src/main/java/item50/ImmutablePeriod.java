package item50;

import java.time.LocalDate;
import java.util.Date;

public class ImmutablePeriod {

  private final LocalDate start;
  private final LocalDate end;

  public ImmutablePeriod(LocalDate start, LocalDate end) {
    if (start.compareTo(end) > 0) {
      throw new IllegalArgumentException(start + "가 " + end + "보다 늦다");
    }
    this.start = start;
    this.end = end;
  }

  public LocalDate start() {
    return start;
  }

  public LocalDate end() {
    return end;
  }
}
