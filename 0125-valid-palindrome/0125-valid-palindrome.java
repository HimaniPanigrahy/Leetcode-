class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray() ;
        int n = ch.length ;
        int left = 0;
        int right = n-1 ;
        while(left<right)
        {
            if(!Character.isLetterOrDigit(ch[left]))
            {
                left++ ;
                continue ;
            }
           if(!Character.isLetterOrDigit(ch[right]))
            {
                right-- ;
                continue ;
            }  
            if(Character.toLowerCase(ch[left])!=Character.toLowerCase(ch[right]))
            {
                return false ;
            }
            left ++ ;
            right-- ;
        }
        return true ;

    }
}