class A
{
  int age;
  public void show()
  {
    System.out.println("Age: " + age);
  }
  class B
  {
  
    public void display()
    {
      System.out.println("Age from inner class: " + age);
    }
  } 
}
public class Inner

{
  public static void main(String[] args)
  {
    A obj = new A();
    obj.age = 25;
    obj.show();
    
    A.B obj2 = obj.new B();
    obj2.display();
  }
}