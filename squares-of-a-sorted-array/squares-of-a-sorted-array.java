class Solution {
    public int[] sortedSquares(int[] nums) {
        int finalResult[] = new int[nums.length];
        
        int left = 0,right = 0, itr = 0;
        
        for(int i =0;i < nums.length; i++)
        {
            if(nums[i] < 0)
            {
                right = right+1;
            }
             nums[i] = nums[i]*nums[i];
        }
        left = right-1;
        
       // System.out.println(left + "  " + right);
        
        while(left >= 0 && right <= nums.length-1)
        {
            if(nums[left] > nums[right])
            {
                finalResult[itr] = nums[right];
                right = right+1;
            }
            else
            {
                finalResult[itr] = nums[left];
                left = left-1;
            }
            itr = itr+1;
        }
        
        while(left >=0)
        {
            finalResult[itr] = nums[left];
            left = left-1; itr = itr+1;
        }
        
        while(right <= nums.length-1)
        {
            finalResult[itr] = nums[right];
            right = right+1; itr = itr+1;
        }
        
        return finalResult;
    }
}