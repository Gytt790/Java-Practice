class Navexception extends Exception
{
    public Navexception(String message)
    {
        super(message);
    }
}
class A 
{
    public void show()
    {

    try
{   
    Class.forName("Demo");
}
catch(ClassNotFoundException e)
{
    System.out.println("Class not found: " + e);
}
    }
}
public class Demo1exception {
    static{
        System.out.println("static block is executed");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

    }
}