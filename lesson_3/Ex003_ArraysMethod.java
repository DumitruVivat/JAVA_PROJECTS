package lesson_3;

import java.util.*;

public class Ex003_ArraysMethod {
  public static void main(String[] args) {
    // int day = 29;
    // int month = 9;
    // int year = 1990;
    // Integer[] date = { day, month, year };
    // // for (Integer integer : date) {
    // //   System.out.print(integer);
    // // }
    // List<Integer> d = Arrays.asList(date);
    // System.out.println(d);

    StringBuilder day = new StringBuilder("28");
    StringBuilder month = new StringBuilder("9");
    StringBuilder year = new StringBuilder("1990");
    StringBuilder[] date = {day, month, year};
    List<StringBuilder> d = Arrays.asList(date);
    System.out.println(d);
    month = new StringBuilder("09");
    date[1] = new StringBuilder("09");
    System.out.println(d);
  }
}
