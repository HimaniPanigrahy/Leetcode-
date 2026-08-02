class Solution {
    public int maxVowels(String s, int k) {
        int l =0;
        int c =0;
        int n =s.length();
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            c++ ;
        }
        int maxCount=c ;
        for(int i=k;i<n;i++)
        {
            if(isVowel(s.charAt(i)))
            c++ ;
            if(isVowel(s.charAt(i-k)))
            c-- ;
            maxCount = Math.max(maxCount,c) ;
        }
        return maxCount ;
    }
   public boolean isVowel(char ch)
   {
    return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
   }
}