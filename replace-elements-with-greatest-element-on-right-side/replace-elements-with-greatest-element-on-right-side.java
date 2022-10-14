class Solution {
    public int[] replaceElements(int[] arr) {
        
        int cur_high = arr[arr.length-1];
        arr[arr.length-1] =-1;
        
        for(int i = arr.length-2; i>=0; i--)
        {
            int cur = arr[i];
            arr[i] = cur_high;
            
            if(cur > cur_high)
            {
                cur_high = cur;
            }
        }
        
        return arr;
    }
}