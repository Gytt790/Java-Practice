//  class A implements Runnable 
//  {
    // public void run()
    // {
    //     for(int i=0;i<5;i++)
    //     {
    //     System.out.println("Hello");
    //     try
    //     {
    //         Thread.sleep(2);
    //     }
    //     catch(InterruptedException e)
    //     {
    //         e.printStackTrace();
    //     }
        
    // }
    // }
    
   
//  }
// class B implements Runnable
//  {
    // public void run()
    // {
    //     for(int j=0;j<5;j++)
    //     {
    //     System.out.println("Hi");
    //     try
    //     {
    //         Thread.sleep(2);
    //     }
    //     catch(InterruptedException e)
    //     {
    //         e.printStackTrace();
    //     }
        
    // }
    // }
 // }
 class counter
 {
    int count;
    public synchronized void increment()
    {
        count ++;
    }
 }
public class demothread
{
    public static void main(String[] args) throws InterruptedException {
        counter c = new counter();
        Runnable obj1= () -> {
            for(int i=0;i<1000;i++)
            {
                // System.out.println("Hello");
                // try
                // {
                //     Thread.sleep(2);
                // }
                // catch(InterruptedException e)
                // {
                //     e.printStackTrace();
                // }
                c.increment();
            }
        };
        Runnable obj2= () -> {
            for(int j=0;j<1000;j++)
            {
                // System.out.println("Hi");
                // try
                // {
                //     Thread.sleep(2);
                // }
                // catch(InterruptedException e)
                // {
                //     e.printStackTrace();
                // }
                c.increment();
            }
        };

       Thread t1 = new Thread(obj1);
       Thread t2 = new Thread(obj2);

       

         t2.start();
         t1.start();

         t1.join();
         t2.join();

         System.out.println(c.count);
        
    }
    
}
 