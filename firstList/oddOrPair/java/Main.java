package firstList.oddOrPair.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%s", (scanner.nextInt() + scanner.nextInt()) % 2 == 0 ? "Bino" : "Cino");

        scanner.close();
    }
}