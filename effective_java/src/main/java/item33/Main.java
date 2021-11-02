package item33;

public class Main {

  public static void main(String[] args) {
    Favorites favorites = new Favorites();

    favorites.putFavorite(Integer.class, 1);
    favorites.putFavorite(String.class, "2");
    favorites.putFavorite(Class.class, Favorites.class);

    String favorite = favorites.getFavorite(String.class);
  }
}
