package lesson_3;
import java.util.*;

public class Ex002_ArrayList {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<Integer>();
    list.add(2809);
    list.add(2901);
    list.add(4214);
    list.add(3421);
    list.add(4214);
    list.add(4214);
    list.add(2859);
    list.add(2839);
    list.add(2879);
    list.add(29);

    // list.add("String line");

    System.out.println("using get() " + list.get(0));
    System.out.println("usig indexOf() " + list.indexOf(4214));
    System.out.println("using remove() " + list.remove(5));
    System.out.println("using lastIndex() " + list.lastIndexOf(4214));
    System.out.println("using set() " + list.set(3, 3422));
    System.out.println("using sort() ");
    Collections.sort(list);

    List<Integer> list2 = list.subList(0 , 4);

    for (Integer i : list) {
      System.out.println("list = " + i);
    }

    for (Integer j : list2) {
      System.out.println("list2 = " + j);
    }
  }
}
