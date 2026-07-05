interface A
{
    int add(int i, int j);
}
public class Lambdareturn {
    public static void main(String[] args) {
        //A obj = (i,j)-> i+j;  (lambda expression with return type)
        //or
        A obj = (i,j)-> {return i+j;};  //lambda expression with return type
       int result = obj.add(10,20);
       System.out.println(result);
    }
}