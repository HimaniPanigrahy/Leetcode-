class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0, r = 0, sub = 0;
        int n = nums.length;
        int p = 1;
        int c = 0;
        if(k<=1)
        return 0 ;
        while (r < n) {
            p = p * nums[r];
            while (p >= k) {
                if(l<n)
                p = p / nums[l++];
            }
            
         c=c+(r-l+1) ;
         r++ ;
        }
        return c ;
    }
}