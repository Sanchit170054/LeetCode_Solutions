class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        if(nums.length == 0)
        {
            return 0;
        }
        
        for(int i =0; i <nums.length-1; i++)
        {
            if(nums[i] != nums[i+1])
            {
                nums[index] = nums[i];
                index = index+1;
            }
        }
        // System.out.println(index);
        nums[index] = nums[nums.length-1];
        
        return index+1;
    }
}