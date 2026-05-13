enum status{
    running,stopped, failed,success;
}
public class enumDemo {
    public static void main(String[] args) {
        status s = status.running;
        System.out.println(s);
        System.out.println(s.getClass());// to get the class name of enum
// to print all the values of enum we used for loop
        status[] ss = status.values();
        for(status s1:ss) {
            System.out.println(s1 + " " + s1.ordinal());
        }
    }
}