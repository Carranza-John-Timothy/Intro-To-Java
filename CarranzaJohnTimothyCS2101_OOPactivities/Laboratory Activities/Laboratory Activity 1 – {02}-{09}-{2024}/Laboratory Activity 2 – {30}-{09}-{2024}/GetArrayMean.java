import java.util.Scanner;

public class GetArrayMean {
    public GetArrayMean() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; ++i) {
            System.out.print("Enter Number: ");
            array[i] = scanner.nextInt();
        }

        double mean = getArrayMean(array);
        System.out.println("Mean of array is: " + mean);
    }

    public static double getArrayMean(int[] array) {
        int sum = 0;
        int[] var2 = array;
        int var3 = array.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int num = var2[var4];
            sum += num;
        }

        double mean = (double)sum / (double)array.length;
        return mean;
    }
}
