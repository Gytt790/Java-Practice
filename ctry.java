public class ctry {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = 18 / a;
            System.out.println("Result: " + c  );
        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally {
            System.out.println("This block will always execute.");
        }
    }
}