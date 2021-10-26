package item28;

import java.util.ArrayList;
import java.util.List;

public class Item28 {

  public void playground() {
    // 컴파일 오류
    // List<Object> objectList = new ArrayList<Long>();

    Object[] objectArray = new Long[1];
    objectArray[0] = "hihi";

  }
}
