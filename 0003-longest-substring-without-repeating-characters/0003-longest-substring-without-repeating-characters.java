class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>() ;
        int l =0 ;
        int max = Integer.MIN_VALUE ;
        int n = s.length() ;
        for(int r=0;r<n;r++)
        {
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l)) ;
                l++ ;
            }
            set.add(s.charAt(r)) ;
            max = Math.max(max,r-l+1) ;
        }
        if(max==Integer.MIN_VALUE )return 0 ;
        else return max ;
    }
}