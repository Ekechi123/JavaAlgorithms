// MatrixDeterminant.java
public class MatrixDeterminant {
    public static int determinant(int[][] matrix) {
        int n = matrix.length;

        // Base case for 2x2 matrix
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int det = 0;

        // Recursive case for larger matrices
        for (int i = 0; i < n; i++) {
            int[][] subMatrix = getSubMatrix(matrix, 0, i);
            det += Math.pow(-1, i) * matrix[0][i] * determinant(subMatrix);
        }

        return det;
    }

    // Helper function to get submatrix by removing the first row and the i-th column
    private static int[][] getSubMatrix(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int[][] subMatrix = new int[n - 1][n - 1];
        int r = 0;

        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                subMatrix[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }

        return subMatrix;
    }
}

