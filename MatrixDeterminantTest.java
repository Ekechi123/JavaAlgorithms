// MatrixDeterminantTest.java
public class MatrixDeterminantTest {
    public static void main(String[] args) {
        // Test 1: 2x2 matrix
        int[][] matrix1 = {{1, 2}, {3, 4}};
        System.out.println(MatrixDeterminant.determinant(matrix1));  // Expected output: -2

        // Test 2: 3x3 matrix
        int[][] matrix2 = {{1, 2, 3}, {0, 4, 5}, {1, 0, 6}};
        System.out.println(MatrixDeterminant.determinant(matrix2));  // Expected output: 4

        // Test 3: 2x2 matrix with zero determinant
        int[][] matrix3 = {{1, 2}, {2, 4}};
        System.out.println(MatrixDeterminant.determinant(matrix3));  // Expected output: 0
    }
}

