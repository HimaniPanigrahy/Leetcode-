class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n =nums.length ;
        int l =0 ;
        int max =0 ;
        for(int r =0;r<n;r++)
        {
            if(nums[r]==0)
            {
                max = Math.max(max,r-l) ;
                l=r+1 ;
            }
        }
        max = Math.max(max,n-l) ;
        return max ;
    }
}