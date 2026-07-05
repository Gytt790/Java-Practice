class Solution {
    public int diagonalPrime(int[][] nums) {
        int MaxPrime=0;
        for(int i=0;i<nums.length;i++)
        {
            int a=nums[i][i];
            if(isPrime(a))
            {
            MaxPrime = Math.max(MaxPrime,a);
            }
            int b=nums[i][nums.length-1-i];
            if(isPrime(b))
            {
                MaxPrime=Math.max(MaxPrime,b);
            }
        }
             return MaxPrime;
        }
       private boolean isPrime(int num)
       {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
       }
}
public class MatrixPValue {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int result = solution.diagonalPrime(grid);
        System.out.println("Result: " + result);
    }
}