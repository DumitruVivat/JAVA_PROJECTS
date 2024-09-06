package lesson_2;

public class Main {
  public static void main(String[] args) {

    // String str1 = "Dumitru";
    // String str2 = "Vivat";

    // System.out.println(str1.concat(str2));

    // Object obj = new Object();
    // int myInt = 100;
    // System.out.println(obj.getClass());
    // System.out.println();
    // String str = new String();
    // System.out.println(str.valueOf(obj).getClass());
    // System.out.println(str.valueOf(myInt).getClass());

    // String str3 = new String();
    // System.out.println(str3.join(" ", "Hello","World", "and","Dumitru"));

    // String str4 = "CocogiamboC";
    // System.out.println(str4.charAt(7));

    // String myStr = "Hello planet earth, you are a great planet.";
    // System.out.println(myStr.lastIndexOf("planet"));
    // System.out.println(myStr.lastIndexOf("e", 5));

    // String myStr = "Hello planet earth, you are a great planet. Better is
    // Saturn.";
    // System.out.println(myStr.startsWith("Hel"));
    // System.out.println(myStr.endsWith("n."));

    // String myStr = "Dumitru";
    // System.out.println(myStr.replace('u', 'n'));

    // String myStr = " Hello planet earth, you are a great planet. Better is
    // Saturn. ";
    // System.out.println(myStr);
    // System.out.println(myStr.trim());

    // String myStr = "Dumitru";
    // String myStr1 = "DUMITRU";
    // System.out.println(myStr.substring(0, 4));

    // System.out.println(myStr.toLowerCase());
    // System.out.println(myStr.toUpperCase());

    // System.out.println(myStr.compareTo(myStr1));
    // System.out.println(myStr.equals(myStr1));

    // System.out.println(myStr.equalsIgnoreCase(myStr1));
    // String myStr1 = "Hello, World!";
    // String myStr2 = "New World";

    // System.out.println(myStr1.regionMatches(7, myStr2, 4, 5));
    // System.out.println(myStr1.regionMatches(0, myStr2, 0, 5));

    String[] name = { "C", "е", "р", "г", "е", "й" };
    String sk = "СЕРГЕЙ КА.";
    System.out.println(sk.toLowerCase()); // сергей ка.
    System.out.println(String.join("", name)); // Cергей
    System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
    // C,е,р,г,е,й
    System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
  }
}
