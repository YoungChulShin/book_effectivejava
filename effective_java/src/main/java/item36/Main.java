package item36;

import item36.Text.Style;
import java.util.EnumSet;

public class Main {

  public static void main(String[] args) {
    Text text = new Text();
    text.applyStyles(EnumSet.allOf(Style.class));
    text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
  }
}
