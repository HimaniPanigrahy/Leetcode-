class Solution {
    public int hammingDistance(int x, int y) {
        int count =0 ;
        int xor =0;
        xor=x^y ;
    while(xor!=0)
    {
        int d =xor%2 ;
        if(d==1)
        count++ ;
        xor=xor/2 ;
    }
    return count ;
    }
}