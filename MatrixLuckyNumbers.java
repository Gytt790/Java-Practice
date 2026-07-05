import java.util.ArrayList;

import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) 
    {
        List<Integer> list =  new ArrayList<>();
        int a=0,b=0;
        for(int i=0;i<matrix.length;i++)
        {
            a = Math.min(a,matrix[i]);
            for(int j=0;j<matrix[i].length;j++)
            {
                b = Math.max(b,matrix[j][i]);
                if(a>b)
                {
                    list.add(a);
                }
            }
        }
       return list; 
    }
}
public class MatrixLuckyNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
            {3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}
        };
        List<Integer> luckyNumber = solution.luckyNumbers(matrix);
        System.out.println("Lucky Numbers: " + luckyNumber);
    }
}