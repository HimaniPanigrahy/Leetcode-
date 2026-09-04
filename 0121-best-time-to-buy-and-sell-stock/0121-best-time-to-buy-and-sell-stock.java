class Solution {
    public int maxProfit(int[] prices) {
       int max =0; 
        int buyPrice =Integer.MAX_VALUE ;
        for(int i =0;i<prices.length;i++)
        {   int profit =0 ;
            
            if(buyPrice>prices[i]) buyPrice=prices[i] ;
            else{
                profit= prices[i]-buyPrice ;
                max=Math.max(max,profit) ;
            }
        }
       return max ;
    }
}