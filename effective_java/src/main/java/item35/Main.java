package item35;

public class Main {

  public static void main(String[] args) {
    System.out.println(Ensemble.SOLO.numberOfMusicians());
    System.out.println(Ensemble.DUET.numberOfMusicians());

    System.out.println(Ensemble.SOLO.name());
    System.out.println(Ensemble.valueOf("SOLO"));

    System.out.println(Ensemble.SOLO.ordinal());
  }
}
