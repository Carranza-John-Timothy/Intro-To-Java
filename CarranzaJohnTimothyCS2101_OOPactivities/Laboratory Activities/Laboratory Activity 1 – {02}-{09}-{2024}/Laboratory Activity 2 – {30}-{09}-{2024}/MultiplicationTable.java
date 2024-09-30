import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the multiplication table: ");
            int maxSize = scanner.nextInt();

            int[][] table = new int[maxSize][maxSize];

            for (int i = 1; i <= maxSize; i++) {
                for (int j = 1; j <= maxSize; j++) {
                    table[i-1][j-1] = i * j;
                }
            }

            System.out.println("Multiplication Table:");

            for (int i = 0; i < maxSize; i++) {
                for (int j = 0; j < maxSize; j++) {
                    System.out.printf("%4d", table[i][j]);
                }
                System.out.println();
            }
        }
    }
}
