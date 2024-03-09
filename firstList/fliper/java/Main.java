import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[] { scanner.nextInt(), scanner.nextInt() };

        if (nums[0] == 1) {
            System.out.printf("%c", nums[1] == 1 ? 'A' : 'B');
        } else {
            System.out.printf("C");
        }

        scanner.close();
    }
}