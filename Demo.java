abstract class car
{
    public abstract void drive();
    public void playmusic()
    {
        System.out.println("playing music");
    }

}
class wagonr extends car
{
    public void drive()
    {
        System.out.println("driving wagonr");
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        car c1 = new wagonr();
        c1.drive();
        c1.playmusic();
    }
}  

