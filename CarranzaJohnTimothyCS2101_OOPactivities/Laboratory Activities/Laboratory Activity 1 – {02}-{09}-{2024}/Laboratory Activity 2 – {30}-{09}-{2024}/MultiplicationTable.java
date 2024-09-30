import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the size of the multiplication table: ");
            int maxSize = scanner.nextInt();

            int[][] table = fillMultiplicationTable(maxSize);
            printMultiplicationTable(table);
        }
    }

    public static int[][] fillMultiplicationTable(int size) {
        int[][] table = new int[size][size];

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[i-1][j-1] = i * j;
            }
        }

        return table;
    }

    public static void printMultiplicationTable(int[][] table) {
        System.out.println("Multiplication Table:");
1
        for (int[] ints : table) {
            for (int anInt : ints) {
                System.out.printf("%4d", anInt);
            }
            System.out.println();
        }
    }
}
