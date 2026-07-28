class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int sum1 =0 ;
    int n = nums.length ;
    for(int i =0;i<k;i++)
    {
        sum1+=nums[i] ;
    }
    int maxSum = sum1 ;
    for(int i=k;i<n;i++)
    {
       sum1+=nums[i] ;
       sum1-=nums[i-k] ;
       maxSum = Math.max(maxSum,sum1) ;
    }
    return (double)maxSum/k ;    
    

    }
}  