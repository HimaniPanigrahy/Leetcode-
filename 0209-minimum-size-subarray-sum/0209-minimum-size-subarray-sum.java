class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int  l=0;
        int sum = 0 ;
        int min = Integer.MAX_VALUE ;
        int n = nums.length;
        for(int r=0;r<n;r++)
        {
          sum+=nums[r] ;
          while(sum>=target)
          {
            min = Math.min(min,r-l+1) ;
            sum -=nums[l] ;
            l++ ;
          }
        }

        if(min==Integer.MAX_VALUE)return 0 ;
        else return min ;
        
    }
}