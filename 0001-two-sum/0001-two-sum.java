class Solution {
    public int[] twoSum(int[] arr, int target) {
       HashMap<Integer,Integer> map = new HashMap<>() ;
       int n ;
       for(int  i =0;i<arr.length ;i++)
       { 
        n = target-arr[i] ;
        if(map.containsKey(n))
        {
            return new int[]{map.get(n),i} ;
        }
        map.put(arr[i],i) ;
       }
       return new int[]{-1,1} ;
    }
}