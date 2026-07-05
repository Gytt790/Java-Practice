class A extends Thread
{
    public void run()
    {
        for(int i=1;i<100;i++)
        {
            System.out.println("Thread A is running");
            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int j=1;j<100;j++)
        {
            System.out.println("Thread B is running");
            try
            {
                Thread.sleep(10);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }   
            
        }
    }
}
public class lethread
{
    public static void main(String[] a)
    {
        A obj1 = new A();
        B obj2 = new B();
        
        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    
    }
}