class NaveenException extends Exception
{
    public NaveenException(String message)
    {
        super(message);
    }
}
public class OwnException {
    public static void main(String[] args) {
          int a=5;
        int b=0;
    
        try
        {
            b = 20/a;
            if(b==0)
            throw new NaveenException("This is my own exception");
        }
        catch(NaveenException e)
        {
            b = 20/1;
            System.out.println("default output" + e);
        }
        System.out.println(b);
    }
}