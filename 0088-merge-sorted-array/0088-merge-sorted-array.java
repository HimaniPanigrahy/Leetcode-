class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int a = 0;
       int b = 0 ; 
       while(a<nums1.length&&b<nums2.length)
       {
        if(nums1[a]==0)
        {
            nums1[a]=nums1[a]+nums2[b] ;
            b++ ;
        }
        a++ ;
       }
       Arrays.sort(nums1) ;
    }
}