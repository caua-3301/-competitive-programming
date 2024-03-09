package firstList.bond.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%c", (scanner.nextInt() + scanner.nextInt()) > 50 ? 'N' : 'S');

        scanner.close();
    }
}