package item15;

public class Application {

  public static void main(String...args) {
    try {
//      Store.MODIFIABLE_MENUS.add("soup");
//      Store.MENUS.add("soup");

//      System.out.println(Store.PRIVATE_MENUS[0]);
//      Store.PRIVATE_MENUS[0] = "cake";
//      System.out.println(Store.PRIVATE_MENUS[0]);

      System.out.println(Store.MODIFIABLE_MENUS.get(0));
      Store.MODIFIABLE_MENUS.set(0, "cake");
      System.out.println(Store.MODIFIABLE_MENUS.get(0));
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
