import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("%.0f", Math.pow(scanner.nextDouble(), 2));

        scanner.close();
    }
}