class Solution {
    public int countValidPrefixes(String s) {
        int ans = 0;
        int countZero =0;
        int countOne =0 ;
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')countZero++ ;
            else countOne++ ;
            if(Math.abs(countZero-countOne)<=1)ans++ ;
        }
        return ans ;
    }
}