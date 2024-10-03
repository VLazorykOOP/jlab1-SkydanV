import java.util.Scanner;

public class MatrixVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter matrix size n (n <= 15): ");
        int n = scanner.nextInt();

        
        if (n > 15 || n <= 0) {
            System.out.println("Incorrect matrix size.");
            return;
        }

        double[][] X = new double[n][n];

        
        System.out.println("Enter matrix elements X:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("X[" + i + "][" + j + "] = ");
                X[i][j] = scanner.nextDouble();
            }
        }

        
        double[] Y = new double[n];

        
        for (int i = 0; i < n; i++) {
            double sum = 0;
            boolean foundNegative = false;

            for (int j = 0; j < n; j++) {
                sum += Math.abs(X[i][j]);

                if (X[i][j] < 0) {
                    foundNegative = true;
                    break;
                }
            }

            
            if (foundNegative) {
                Y[i] = sum;
            } else {
                Y[i] = -1;
            }
        }

        
        System.out.println("Vector Y:");
        for (int i = 0; i < n; i++) {
            System.out.println("Y[" + i + "] = " + Y[i]);
        }

        scanner.close();
    }
}
