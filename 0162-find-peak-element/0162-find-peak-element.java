class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length-1 ;
        if(nums.length==1) return 0 ;
        if(nums[n]>nums[n-1]) return n ;

        int l =1;
        int r =n-1 ;
        while(l<=r)
        {   int mid = l+((r-l)/2) ;
            if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return mid ;
            else if (nums[mid]<nums[mid-1])r=mid-1 ;
            else if(nums[mid]<nums[mid+1]) l = mid+1 ;
            else
            {
                l++ ;
                r-- ;
            }
        }
       return 0 ;
    }
}