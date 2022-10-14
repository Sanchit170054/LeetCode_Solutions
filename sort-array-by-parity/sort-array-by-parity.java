class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int first = 0, last = nums.length-1;
        
        while(first < last)
        {
            if(nums[first] % 2 > nums[last] % 2)
            {
                int temp = nums[last];
                nums[last] = nums[first];
                nums[first] = temp;
            }
            
            
            if(nums[first] % 2 == 0)
            {
                first+=1;
            }
            
            if(nums[last] % 2 == 1)
            {
                last-=1;
            }
        }
        
        return nums;
        
    }
}