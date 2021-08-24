package item15.stores;

import item15.Store;

public class BookStore extends Store {

  public void accessTest() {
    name = "Change name from child class";
  }

  public void getMainMenu(Store store) {
    System.out.println(store.mainMenu);
  }
}
