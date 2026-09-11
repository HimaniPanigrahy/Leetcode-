class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int xor =0 ;
        int x =0 ;
        int max =Integer.MIN_VALUE ;
        for(int i=0;i<n;i++)
        {  
            xor^=nums[i] ;
        }
        for(int i=0;i<=n;i++)
        {
           x^=i ;
        }
        return xor^x ;
    }
}