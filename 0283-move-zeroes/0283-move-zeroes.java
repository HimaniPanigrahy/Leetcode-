class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length ;
        int l = 0 ;
        int r = 0 ;
        while(r<n)
        {
            if(arr[r]!=0)
            {
                int temp= arr[l] ;
                arr[l]=arr[r] ;
                arr[r]=temp ;
                l++ ;
            }
            r++ ;
        }
    }
}

