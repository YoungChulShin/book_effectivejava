package item35;

public enum Ensemble {
  SOLO,
  TRIO,
  DUET;

  public int numberOfMusicians() {
    return ordinal() + 1;
  }
}
