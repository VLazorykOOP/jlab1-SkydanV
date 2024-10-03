import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size (max 300): ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

               int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index++] = arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
    }
}