class Recusrione
{
    public int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
public class RecursionFact
{
    public static void main(String[] args)
    {
        Recusrione s = new Recusrione();
        int n=5;
        int result = s.factorial(n);
        System.out.println(result);
    }

   
    }