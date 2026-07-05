public class DemoException
{
    public static void main(String[] args) {
        int a=100;
        int b=0;
        try
        {
             b=20/a;
          if(b==0)
                {
                    //throw keyword is used to throw an exception explicitly
                    throw new ArithmeticException("cannot divide by zero");
                }      
        }
    
        catch(ArithmeticException e)
        //catching the exception
        {
            b=20/1;
            System.out.println("thats the default output: ");
        }
        System.out.println(b);
        System.out.println("Bye");
    }
}