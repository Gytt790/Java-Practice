public class exceptionCatch {
    public static void main(String[] args) {
        int a=2;
        int b=0;
        int nums[]=new int[5];
        try
        {
            b=20/a;
            System.out.println(nums[0]);
            System.out.println(nums[5]);
        }
    
        catch(Exception e)
        {
            System.out.println("Something went wrong: " + e);
        }
        System.out.println(b);
        System.out.println("Bye");
    }
}