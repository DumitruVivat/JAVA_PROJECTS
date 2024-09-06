import java.util.Random;

public class program {

  private static final int MAX_COEFFICIENT = 100;

  public static void generateAndPrintPolynominal(int k) {
    Random random = new Random();
    int[] coefficients = new int[k + 1];

    for (int i = 0; i <= k; i++) {
      coefficients[i] = random.nextInt(MAX_COEFFICIENT + 1);
    }

    StringBuilder polynominal = new StringBuilder();

    for(int i = k; i >= 0; i--){
      if (coefficients[i] != 0) {
        polynominal.append(coefficients[i] > 0 ? " + " : " - ");
      } else if (coefficients[i] < 0) {
        polynominal.append("-");
      }

      if (i == 0 || coefficients[i] != 1) {
        polynominal.append(Math.abs(coefficients[i]));
      }

      if (i > 0) {
        polynominal.append("x");
      }

      if (i > 1) {
        polynominal.append("^").append(i);
      }
    }

    if (polynominal.length() == 0) {
      polynominal.append("0");
    }

    polynominal.append(" = 0");

    System.out.println(polynominal.toString());
  }

  public static void main(String[] args) {

    int k = 2;
    generateAndPrintPolynominal(k);
  }
}
