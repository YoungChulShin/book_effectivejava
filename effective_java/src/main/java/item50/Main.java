package item50;

import java.time.LocalDate;
import java.util.Date;

public class Main {

  public static void main(String[] args) {
//    Date start = new Date();
//    Date end = new Date();
//    Period period = new Period(start, end);
//    // Period가 수정될 수 있다
//    start.setYear(2024);
//
//    System.out.println(period.start().getYear());

//    LocalDate start = LocalDate.now();
//    LocalDate end = LocalDate.now();
//    ImmutablePeriod period = new ImmutablePeriod(start, end);


    Date start = new Date();
    Date end = new Date();
    MutableToImmutablePeriod period = new MutableToImmutablePeriod(start, end);
    System.out.println(period.start().getYear());
    // Period가 수정될 수 있다
    start.setYear(2024);
    period.start().setTime(2025);

    System.out.println(period.start().getYear());
  }
}
