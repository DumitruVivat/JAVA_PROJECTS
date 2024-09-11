package lesson_3;

import java.util.*;

public class Ex004_ArraysMethod {
  public static void main(String[] args) {

    // List<String> names = new ArrayList<>(5);
    // names.add("Dumitru");
    // names.add("Egor");
    // names.add("Mihai");
    // names.add("Victor");
    // names.add("Gabrile");

    // System.out.println("ArrayList: " + names);
    // // System.out.println("using clear() ");
    // // names.clear();
    // // System.out.println(names);

    // String stringList = names.toString();
    // System.out.println("String: " + stringList);

    // Integer[] arr = new Integer[] { 1, 2, 4, 5, 6, 6 };
    // List<Integer> numbers = Arrays.asList(arr);
    // System.out.println("Array as List: " + numbers);

    // List<Integer> linkedList = new LinkedList<>();
    // for (int i = 0; i < 11; i++) {
    // linkedList.add(i);
    // }
    // List<Integer> linkedList2 = new LinkedList<>();
    // for (int i = -5; i < 1; i++) {
    // linkedList2.add(i);
    // }
    // System.out.println("Elements in linkedList: " + linkedList);
    // System.out.println("Elements in linkedList2: " + linkedList2);

    // Boolean bool = linkedList.containsAll(linkedList2);
    // System.out.println("linkedList is containsAll() of linkedList2: " + bool);

    // List<String> bags = new ArrayList<>();
    // bags.add("pen");
    // bags.add("pencil");
    // bags.add("paper");

    // List<String> boxes = new LinkedList<>();
    // boxes.add("pen");
    // boxes.add("paper");
    // boxes.add("books");
    // boxes.add("rubber");

    // System.out.println("Bags Contains: " + bags);
    // System.out.println("Boxes Contains: " + boxes);

    // boxes.retainAll(bags);

    // System.out.println("After Applaying retainAll() mothod to Boxes");
    // System.out.println("Bags Contains: " + bags);
    // System.out.println("Boxes Contains: " + boxes);

    // ArrayList<String> cars = new ArrayList<String>();
    // cars.add("Volvo");
    // cars.add("BMW");
    // cars.add("Ford");
    // cars.add("Mazda");
    // cars.add("Toyota");
    // System.out.println("cars: " + cars);
    // cars.removeAll(cars);
    // System.out.println("using removeAll()");
    // System.out.println(cars);

    // List<String> list = new LinkedList<>();

    // list.add("glass");
    // list.add("plate");
    // list.add("fork");
    // list.add("knife");
    // System.out.println("linkedList: " + list);

    // System.out.println("arrays of objects: " + list.toArray());

    // System.out.println("converting toArray()");
    // String[] arr = list.toArray(new String[0]);
    // for(String x : arr) {
    //   System.out.println(x + " ");
    // }

    List<String> original = Arrays.asList("Dumitru", "Andrei", "Ana", "Ion", "Vanea");
    System.out.println("original: " + original);
    List<String> copy = List.copyOf(original);
    System.out.println("copy: " + copy);
    copy = List.of("Dumitru");
    System.out.println("listOf: " + copy);
  }
}
