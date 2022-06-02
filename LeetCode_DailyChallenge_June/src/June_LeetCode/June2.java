package June_LeetCode;

public class June2 {

}
//only program logic
class Solution1 {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] sol = new int[c][r];
        for (int i = 0; i < matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                sol[j][i] = matrix[i][j];
            }
        }
        return sol;
    }
}
