// MatrixMultiplicationTest.java
public class MatrixMultiplicationTest {
    public static void main(String[] args) {
        // Test 1: Regular multiplication
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] result = MatrixMultiplication.multiply(A, B);

        for (int[] row : result) {
            System.out.println(java.util.Arrays.toString(row));
        }
        // Expected output:
        // [19, 22]
        // [43, 50]

        // Test 2: Identity matrix multiplication (should return A)
        int[][] I = {{1, 0}, {0, 1}};
        int[][] result2 = MatrixMultiplication.multiply(A, I);
        for (int[] row : result2) {
            System.out.println(java.util.Arrays.toString(row));
        }
        // Expected output:
        // [1, 2]
        // [3, 4]
    }
}

