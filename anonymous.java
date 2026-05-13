class A
{
    public void show()
    {
        System.out.println("showing A");
    }
}
public class anonymous
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("showing anonymous class");
            }
        };

        obj.show();
    }
}