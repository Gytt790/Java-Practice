public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        int[][] M1={
            {1,2,3},
            {4,5,6}
        };
        int[][] M2={
            {7,8},
            {9,10},
            {11,12}
        };
        int[][] r = new int[2][2];
        int sum=0;
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<3;k++)
                {
                    sum=sum+M1[i][k]*M2[k][j];
                }
              r[i][j]=sum;
              sum=0;
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(r[i][j]+" ");
            }
            System.out.println();
        }
    }
}