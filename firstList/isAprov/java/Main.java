package firstList.isAprov.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();

        if ((notaA + notaB) / 2 >= 7)
            System.out.printf("Aprovado");
        else if ((notaA + notaB) / 2 < 7 && (notaA + notaB) / 2 >= 4)
            System.out.printf("Recuperacao");
        else
            System.out.printf("Reprovado");

        scanner.close();
    }
}