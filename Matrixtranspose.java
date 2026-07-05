class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
       int[][] result = new int[n][m]; 
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                result[j][i]=matrix[i][j];
            }
        }
        return result;
    }
}
public class Matrixtranspose
{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = s.transpose(matrix);
       for(int i=0;i<result.length;i++)
        {
            for(int j=0;j<result[i].length;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

}