
    public class MatrixTranspose {
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            int rows = matrix.length;
            int columns = matrix[0].length;
    
            // Create a new matrix to store the transposed elements
            int[][] transposeMatrix = new int[rows][columns];
    
            // Transpose the matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    transposeMatrix[i][j] = matrix[j][i];
                }
            }
    
            // Print the transposed matrix
            System.out.println("Original Matrix:");
            printMatrix(matrix);
            
            System.out.println("Transposed Matrix:");
            printMatrix(transposeMatrix);
        }
    
        // Helper method to print the matrix
        public static void printMatrix(int[][] matrix) {
            int rows = matrix.length;
            int columns = matrix[0].length;
    
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    

