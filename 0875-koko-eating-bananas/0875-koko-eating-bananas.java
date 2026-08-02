class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }
        int l = 1, r = max;
        int ans =max ;
        while (l <= r) {
            long hours = 0;
            int mid = l + (r - l) / 2;
            for (int x : piles) {
                hours += (x + mid - 1) / mid;
            }
            if (hours <= h) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}