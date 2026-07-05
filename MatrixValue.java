import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int a=0;a<grid.length;a++)
        {
            Arrays.sort(grid[a]);
        }
        int sum=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<n;i++)
        {
            int maxColEle=0;
            for(int j=0;j<m;j++)
            {
                maxColEle=Math.max(maxColEle,grid[j][i]);
            }
            sum+=maxColEle;
        }
        return sum;
    }
}
public class MatrixValue
{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] mat = {
                {1, 2, 4},
                {3, 3, 1}
        };
        int result = solution.deleteGreatestValue(mat);
        System.out.println("The sum of the greatest values is: " + result);
    }
}