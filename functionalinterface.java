@FunctionalInterface
interface A
{
    void show(int i);
}
//we used Lmda expression to implement the method of functional interface
//we can use lambda expression only when there is only one abstract method in the interface
//lambda expression

public class functionalinterface
{
    public static void main(String[] args) {
        
        A obj=(i)->System.out.println("in show method: " + i);
        obj.show(5);
    }
}