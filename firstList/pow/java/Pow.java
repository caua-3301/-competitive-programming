package firstList.pow.java;

import java.util.Scanner;
import java.util.Locale;

public class Pow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.printf("%.4f", Math.pow(scanner.nextDouble(), scanner.nextDouble()));

        scanner.close();
    }
}
