package lesson_3;

public class Ex01_2_arrays {
  public static void main(String[] args) {
    // int[] a = new int[] {1, 9};
    // int[] b = new int[3];
    // System.arraycopy(a, 0, b, 0, a.length);

    // for (int i : a) {
    // System.out.printf("%d ", i);
    // }
    // System.out.println("");
    // for (int j : b) {
    // System.out.printf("%d ", j);
    // }

    int[] a = new int[] {0, 9};
    for (int i : a) {
      System.out.printf("%d ", i);
    }
    System.out.println();
    a = AddItem(a, 2);
    a = AddItem(a, 3);
    for (int j : a) {
      System.out.printf("%d ", j);
    }
  }

  static int[] AddItem(int[] array, int item) {
    int length = array.length;
    int[] temp = new int[length + 1];
    System.arraycopy(array, 0, temp, 0, length);
    temp[length] = item;
    return temp;
  }
}
