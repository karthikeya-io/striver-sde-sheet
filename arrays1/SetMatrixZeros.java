import java.util.HashSet;

class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        HashSet<Integer> cols = new HashSet<>();

        // Store the row and column index with value 0
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length;j++) {
                if(matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        // Nullify rows
        for(Integer row : rows) {
            for(int i = 0; i < matrix[0].length; i++) {
                matrix[row][i] = 0;
            }
        }

        // Nullify columns
        for(Integer col : cols) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }

        // time complexity
        // O(MN) where M is the number of rows and N is the number of columns
        // space complexity
        // O(M + N)

        // TODO: Optimize the space complexity to O(1)

    }
}