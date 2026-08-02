class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length ;
        HashMap<Integer,Integer> map = new HashMap<>() ;
        for(int i =0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            map.put(arr[i],map.get(arr[i])+1) ;
            else
            {
                map.put(arr[i],1) ;
            }
        }
        int ans = -1;
        for(int j =0;j<n;j++)
        {
            if(arr[j]==map.get(arr[j]))
            {
                ans = Math.max(ans,arr[j]) ;
            }
            
        }
        return ans;
    }
}