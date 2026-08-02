class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 0;
        int j = 1;
        boolean inc = true ;
        boolean dec = true ;
        while (i < nums.length && j < nums.length) {
            if (nums[i] > nums[j])
                inc = false ;
            if (nums[i] < nums[j])
                dec = false ;
            i++;
            j++;
        }
        return inc||dec;
    }
}