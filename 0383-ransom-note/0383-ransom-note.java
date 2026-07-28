class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>() ;
        if(magazine.length()<ransomNote.length()) return false ;
        char[] c = ransomNote.toCharArray() ;
        char[] ch = magazine.toCharArray() ;
        for(int i =0;i<magazine.length();i++)
        {
            map.put(ch[i],map.getOrDefault(ch[i],0)+1) ;
        }
        for(int i =0;i<ransomNote.length();i++)
        {
            if(map.getOrDefault(c[i],0)==0) return false ;
            map.put(c[i],map.get(c[i])-1) ;
        }
        return true ;
    }
}