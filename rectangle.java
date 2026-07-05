import java.util.Arrays;

class Solution {
    public int[] constructRectangle(int area) {
        int width=(int) Math.sqrt(area);
System.out.println(width);
        while(area%width != 0)
        {
            width--;
        }
        int l = area/width;
        return new int[] {l,width};
    }
}
public class rectangle
{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        int a = 20;
        int[] result=s.constructRectangle(a);
        System.out.println(Arrays.toString(result));
    }
}