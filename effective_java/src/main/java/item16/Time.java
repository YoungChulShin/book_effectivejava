package item16;

public final class Time {

  public final int hour;
  public final int minutes;
  public int days;

  public Time(int hour, int minutes) {
    this.hour = hour;
    this.minutes = minutes;
  }

  public String name;

  public String getName() {
    return name;
  }
}
