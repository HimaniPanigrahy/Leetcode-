import java.util.Scanner ;
class Solution {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int r = 0;
        while (x != 0) {
        int digit = x % 10;
            r = r * 10 + digit;
            x = x / 10;
        }
        if (temp == r&& temp>=0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in) ;
        int x=sc.nextInt() ;
        boolean result = isPalindrome( x) ;
        System.out.println(result);
}}