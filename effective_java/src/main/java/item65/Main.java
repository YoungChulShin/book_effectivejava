package item65;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    // 클래스 이름을 Class 객체로 변환
    Class<? extends Set<String>> cl = null;
    try {
      cl = (Class<? extends Set<String>>)Class.forName(args[0]);
    } catch (ClassNotFoundException e) {
      System.out.println("클래스를 찾을 수 없습니다");
      return;
    }

    // 클래스 객체에서 생성자 추출
    Constructor<? extends Set<String>> cons = null;
    try {
      // Returns a "root" Constructor object
      cons = cl.getDeclaredConstructor();
    } catch (NoSuchMethodException e) {
      System.out.println("생성자를 찾을 수 없습니다");
      return;
    }

//    Set<String> s = null;
//    try {
//      s = cons.newInstance();
//    } catch (IllegalAccessException e) {
//      System.out.println("생성자에 접근할 수 없습니다");
//      return;
//    } catch (InstantiationException e) {
//      System.out.println("클래스를 인스턴스화 할 수 없습니다");
//      return;
//    } catch (InvocationTargetException e) {
//      System.out.println("생성자가 예외를 던졌습니다");
//      return;
//    } catch (ClassCastException e) {
//      System.out.println("Set를 구현하지 않은 클래스입니다");
//      return;
//    }
    Set<String> s = null;
    try {
      s = cons.newInstance();
    } catch (ReflectiveOperationException e) {
      System.out.println("Set 인스턴스 생성 중 오류가 발생했습니다");
      return;
    }

    // 생성자 집합 생성
    s.addAll(Arrays.asList(args).subList(1, args.length));
    System.out.println(s);
  }
}
