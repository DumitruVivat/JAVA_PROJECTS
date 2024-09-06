import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PolynomialSum {

    public static void main(String[] args) {

        String file1Path = "/Users/dumitruvivat/Desktop/java_projects/polynomial/polynomial1.txt";
        String file2Path = "/Users/dumitruvivat/Desktop/java_projects/polynomial/polynomial2.txt";
        String resultFilePath = "/Users/dumitruvivat/Desktop/java_projects/polynomial/result.txt";

        try {
            String polynomial1 = readPolynomialFromFile(file1Path);
            String polynomial2 = readPolynomialFromFile(file2Path);

            int[] coeffs1 = parsePolynomial(polynomial1);
            int[] coeffs2 = parsePolynomial(polynomial2);

            int maxDegree = Math.max(coeffs1.length, coeffs2.length);
            int[] resultCoeffs = new int[maxDegree];

            for (int i = 0; i < coeffs1.length; i++) {
                resultCoeffs[i] += coeffs1[i];
            }
            for (int i = 0; i < coeffs2.length; i++) {
                resultCoeffs[i] += coeffs2[i];
            }

            String resultPolynomial = formatPolynomial(resultCoeffs);
            writePolynomialToFile(resultFilePath, resultPolynomial);

            System.out.println("Result polynomial written to " + resultFilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readPolynomialFromFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.readLine();
        }
    }

    private static void writePolynomialToFile(String filePath, String polynomial) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(polynomial);
        }
    }

    private static int[] parsePolynomial(String polynomial) {
        int maxDegree = 0;
        Map<Integer, Integer> coeffsMap = new TreeMap<>(Collections.reverseOrder());
        
        Pattern pattern = Pattern.compile("([+-]?\\d*)x?(?:\\^(\\d+))?");
        Matcher matcher = pattern.matcher(polynomial.replace(" ", ""));

        while (matcher.find()) {
            String coeffStr = matcher.group(1);
            String degreeStr = matcher.group(2);

            int coefficient = coeffStr.isEmpty() || coeffStr.equals("+") ? 1 :
                              coeffStr.equals("-") ? -1 : Integer.parseInt(coeffStr);
            int degree = degreeStr == null ? (matcher.group(0).contains("x") ? 1 : 0) : Integer.parseInt(degreeStr);

            coeffsMap.put(degree, coeffsMap.getOrDefault(degree, 0) + coefficient);
            maxDegree = Math.max(maxDegree, degree);
        }

        int[] coeffs = new int[maxDegree + 1];
        for (Map.Entry<Integer, Integer> entry : coeffsMap.entrySet()) {
            coeffs[entry.getKey()] = entry.getValue();
        }

        return coeffs;
    }

    private static String formatPolynomial(int[] coeffs) {
        StringBuilder polynomial = new StringBuilder();

        boolean firstTerm = true;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            int coeff = coeffs[i];
            if (coeff != 0) {
                if (!firstTerm) {
                    polynomial.append(coeff > 0 ? " + " : " - ");
                } else if (coeff < 0) {
                    polynomial.append("-");
                }

                if (Math.abs(coeff) != 1 || i == 0) {
                    polynomial.append(Math.abs(coeff));
                }
                
                if (i > 0) {
                    polynomial.append("x");
                }
                if (i > 1) {
                    polynomial.append("^").append(i);
                }

                firstTerm = false;
            }
        }

        if (polynomial.length() == 0) {
            polynomial.append("0");
        }

        return polynomial.toString();
    }
}

