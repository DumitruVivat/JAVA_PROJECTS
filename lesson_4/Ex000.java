package lesson_4;

import java.util.PriorityQueue;

public class Ex000 {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(12);
    pq.add(3);
    pq.add(13);
    pq.add(1);
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
  }
}
