class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int a = mat.length;
        for(int i=0;i<a;i++)
        {
            sum+=mat[i][i];
            if(i!=a-1-i)
            {
                sum+=mat[i][a-1-i];
            }
        }
        return sum;
    }
}
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int result = solution.diagonalSum(mat);
        System.out.println("Diagonal Sum: " + result); // Output: Diagonal Sum: 25
    }
}