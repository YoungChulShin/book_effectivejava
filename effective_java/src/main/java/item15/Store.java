package item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Store {

  private static final String[] PRIVATE_MENUS = { "beef", "pork", "chicken"};

  public static final List<String> MENUS = List.of(PRIVATE_MENUS);
//
  public static final List<String> MODIFIABLE_MENUS = Arrays.asList(PRIVATE_MENUS);

  protected String name;

  private String address;

  String phone;

  public String mainMenu;
}
