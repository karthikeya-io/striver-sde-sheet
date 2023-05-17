import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row, prev = null;

        for(int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }
            triangle.add(row);
            prev = row;
        }

        return triangle;
    }
}

// complexities
// time: O(N^2)
// space: O(N^2)
// TODO: work on for getting single number in the triangle when row and col is given
// TODO: work on getting the row when the row number is given
