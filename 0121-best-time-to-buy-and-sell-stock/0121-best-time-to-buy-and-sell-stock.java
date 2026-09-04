class Solution {
    public int maxProfit(int[] prices) {
       int max =0; 
        int buyPrice =prices[0] ;
        for(int i =1;i<prices.length;i++)
        {   //int profit =0 ;
            
            if(buyPrice>prices[i]) buyPrice=prices[i] ;
            else{
               // profit= prices[i]-buyPrice ;
                max=Math.max(max,prices[i]-buyPrice) ;
            }
        }
       return max ;
    }
}