interface A
{
    int age = 29;//all variables in interface are public static final
    String location = "delhi";
    //by default all the methods in interface are abstract and public
    void show();
    void display();
}
class B implements A
{ 
    //if a class implements an interface then it must override all the methods of that interface
    public void show()
    {
        System.out.println("show method");
    }
    public void display()
    {
        System.out.println("display method");
    }
}
public class inter
{
    public static void main(String[] args) 
    {
        //we cannot create object of interface but we can create reference of interface
       A obj;
       obj =  new B();
         obj.show();
            obj.display();
            System.out.println("A.age: " + A.age);
    }
}