class Solution {
    public int thirdMax(int[] nums) {
        int count = 1;
        Arrays.sort(nums);
        int prev = nums[nums.length-1];
        
        for(int i = nums.length-2; i >=0; i--)
        {
            // System.out.println(i);
            if(nums[i] != prev)
            {
                count+=1;
                prev=nums[i];
            }
            
            if(count == 3)
            {
                return nums[i];
            }
        }
        
        return nums[nums.length-1];
    }
}