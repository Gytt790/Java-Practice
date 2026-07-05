class Solution {
    public int mySqrt(int x) {
        for(int i=0; i<=x; i++){
            if(i*i == x){
                return i;
            }
            if(i*i > x){
                return i-1;
            }
            else if(i*i < x){
                continue;
            }
        }
        return 0;
    }
}
public class Squrt {
    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 8;
        System.out.println(s.mySqrt(x));
    }
}