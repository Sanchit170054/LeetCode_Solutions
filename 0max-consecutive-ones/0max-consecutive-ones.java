class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int cur_max = 0;
        for(int i:nums)
        {
            if(i == 1)
            {
                cur_max+=1;
            }
            else
            {
                max = cur_max > max ? cur_max : max;
                cur_max = 0;
            }
        }
        
        return cur_max > max ? cur_max : max;
        
    }
}