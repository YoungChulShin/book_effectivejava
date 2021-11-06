package item36;

import java.util.Set;

public class Text {

  public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

  public void applyStyles(Set<Style> styleSet) {
    styleSet.forEach(x -> System.out.println(x.name()));
  }
}
