interface A{
    void show();
    void display();
}
class B implements A{
    public void show()
    {
        System.out.println("show method");
    }
    public void display()
    {
        System.out.println("display method");
    }
}
public class sam{

public static void main(String[] args) {
    A obj = new B();
    obj.show();
    obj.display();
}
}