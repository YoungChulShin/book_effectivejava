package item50;

import java.util.Date;

public class MutableToImmutablePeriod {

  private final Date start;
  private final Date end;

  public MutableToImmutablePeriod(Date start, Date end) {
    // 방어적 복사를 먼저 한다
    this.start = new Date(start.getTime());
    this.end = new Date(end.getTime());

    if (this.start.compareTo(this.end) > 0) {
      throw new IllegalArgumentException(start + "가 " + end + "보다 늦다");
    }
  }

  public Date start() {
    return (Date)this.start.clone();
  }

  public Date end() {
    return (Date)this.end.clone();
  }
}
