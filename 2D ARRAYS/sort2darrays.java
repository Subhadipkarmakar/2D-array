public class sort2darrays {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 2, 8},
            {3, 9, 4},
            {1, 7, 6}
        };

        // Sort the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                if (matrix[j][0] > matrix[j + 1][0]) {
                    int[] temp = matrix[j];
                    matrix[j] = matrix[j + 1];
                    matrix[j + 1] = temp;
                }
            }
        }

        // Print the sorted 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

