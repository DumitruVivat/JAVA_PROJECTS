package lesson_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex006_Iterator {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();

    names.add("Dumitru");
    names.add("Andrei");
    names.add("Victor");
    names.add("Mihai");
    names.add("Kiril");
    names.add("Gabi");

    // Iterator iterator = names.iterator();
    // System.out.println("List elements : ");
    // while (iterator.hasNext()) {
    //   System.out.print(iterator.next() + " \n");
    // }

    ListIterator<String> listIterator = names.listIterator();
    // System.out.println("In actual order: ");
    // while (listIterator.hasNext()) {
    //   System.out.println(listIterator.next());
    // }
    // System.out.println("In reverse order: ");
    // while (listIterator.hasPrevious()) {
    //   System.out.println("" + listIterator.previous());
    // }

    // System.out.println("Initial list: " + names);
    // System.out.println("previous index: " + listIterator.previousIndex());

    // listIterator.next();
    // listIterator.next();

    // System.out.println("Next index: " + listIterator.nextIndex());

    // System.out.println("The list of names befor using set(): " + names);

    // while (listIterator.hasNext()) {
    //   System.out.println(listIterator.next());
    // }

    // listIterator.set("None");
    // System.out.println("Afer using set(): ");
    // for(String name : names) {
    //   System.out.println(name);
    // }

    System.out.println("Before add new names: " + names);

    while (listIterator.hasNext()) {

      listIterator.add("Artiom");
      listIterator.next();
    }

    System.out.println("After add names: " + names);
  }
}
