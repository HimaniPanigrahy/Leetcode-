class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double total = 0;
        int n =prices.length ;
        Arrays.sort(prices) ;
        Arrays.sort(discounts) ;
        int m = Math.min(prices.length,discounts.length) ;
        // items with discount
        for(int i =0;i<m;i++)
        {
            int p = prices[prices.length-1-i] ;
            int d = discounts[discounts.length-1-i] ;
            total += p*(100.0-d)/100.0 ;
        }
        // items without discount
        for(int i =0;i<n-m;i++)
        {
            total += prices[i] ;
        }
        return (double)total ;
    }
}